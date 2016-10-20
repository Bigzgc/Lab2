package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class connection {
	public static Connection getConnection()
	{
		Connection conn = null;
	try{
		String url="jdbc:mysql://localhost:3306/bookdb";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, "root","a19959119");
	}catch (Exception e) {
		throw new ExceptionInInitializerError(e);
	}
	return conn;
	}
}
