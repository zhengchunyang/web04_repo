package homework_level02_Test01;

import java.sql.SQLException;

public class addService {

	public void add(Student student) throws SQLException {
		new addDao().add(student);
	}

}
