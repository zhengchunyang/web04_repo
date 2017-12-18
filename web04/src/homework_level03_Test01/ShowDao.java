package homework_level03_Test01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ShowDao {

	public ArrayList<StudentDB> show() throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "select * from student";
		ArrayList<StudentDB> list = (ArrayList<StudentDB>)qr.query(sql, new BeanListHandler<>(StudentDB.class));
		return list;
	}

}
