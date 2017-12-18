package com.heima.service;

import java.sql.SQLException;

import com.heima.dao.RegisterDao;
import com.heima.doMain.Customer;

public class RegisterService {

	public void register(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		RegisterDao rd = new RegisterDao();
		rd.register(customer);
	}

}
