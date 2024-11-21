package pk;
import java.io.IOException;
import java.sql.SQLException;

class test {
	void func() {
		try {
			throw new IOException();
			throw new SQLException();
		} catch (IOException | SQLException e) {
			e = new SQLException();
		}
	}
}
