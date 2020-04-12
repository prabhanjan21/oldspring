package fds;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection conn = DriverManager
				.getConnection("jdbc:jtds:sqlserver://127.0.0.1;instance=SQLEXPRESS;database=AdventureWorks2017;integratedsecurity=true");
		System.out.println("test");
		//Statement sta = conn.createStatement();
		//String Sql = "select * from testing_table";
		//ResultSet rs = sta.executeQuery(Sql);
		//while (rs.next()) {
			//System.out.println(rs.getString("txt_title"));
		//}
	}
}
