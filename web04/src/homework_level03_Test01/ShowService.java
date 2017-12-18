package homework_level03_Test01;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowService {

	public ArrayList<StudentDB> show() throws SQLException {

		return new ShowDao().show();
	}

}
