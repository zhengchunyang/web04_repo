package com.heima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.heima.doMain.Customer;
import com.heima.utils.DataSourceUtils;

public class RegisterDao {
	public void register(Customer customer) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql ="insert into customer values(?,?,?,?,?,?,?)";
		qr.update(sql, customer.getId(),customer.getUsername(),customer.getPassword(),customer.getEmail(),customer.getName(),customer.getSex(),customer.getBirthday());
	}
	
}
