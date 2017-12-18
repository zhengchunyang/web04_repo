package homework_level02_Test01;

import java.sql.SQLException;
import java.util.Arrays;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class addDao {

	public void add(Student student) throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "insert into student values(?,?,?,?,?,?)";
		qr.update(sql, student.getName(),student.getSex(),student.getBirthday(),student.getAge(),student.getTel(),Arrays.toString(student.getHobby()));
	}

}
