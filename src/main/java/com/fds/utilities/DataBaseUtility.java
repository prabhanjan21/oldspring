package com.fds.utilities;

import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;

public class DataBaseUtility {

	private static BasicDataSource dataSource;

	Properties prop = new Properties();

	public static BasicDataSource getDataSource() {

		if (dataSource == null) {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
			ds.setUrl(
					"jdbc:jtds:sqlserver://127.0.0.1;instance=SQLEXPRESS;databaseName=AdventureWorks2017;integratedSecurity=true");
			// ds.setUsername("root");
			// ds.setPassword("password");

			ds.setMinIdle(5);
			ds.setMaxIdle(10);
			ds.setMaxOpenPreparedStatements(100);
			ds.setValidationQuery("select 1");

			dataSource = ds;
		}
		return dataSource;
	}

}
