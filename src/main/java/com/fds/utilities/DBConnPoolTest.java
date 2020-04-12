package com.fds.utilities;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class DBConnPoolTest {

	public static void main(String[] args) throws SQLException {

		BasicDataSource dataSource = DataBaseUtility.getDataSource();
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from HumanResources.Department");
		System.out.println("The Connection Object is of Class: " + connection.getClass());
		try {
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
			}
		} catch (Exception e) {
			connection.rollback();
			e.printStackTrace();
		}
	}
}