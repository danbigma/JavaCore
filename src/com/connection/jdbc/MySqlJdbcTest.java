package com.connection.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MySqlJdbcTest {

	private Connection con;

	public void init(FileInputStream fs)
			throws ClassNotFoundException, SQLException, IOException {
		Properties props = new Properties();
		props.load(fs);
		String url = props.getProperty("db.url");
		String userName = props.getProperty("db.user");
		String password = props.getProperty("db.password");

		con = DriverManager.getConnection(url, userName, password);
	}

	public void fetch() throws SQLException, IOException {
		PreparedStatement ps = con.prepareStatement("select SYSDATE from dual");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			// do the thing you do
		}
		rs.close();
		ps.close();
	}

	public static void main(String[] args)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		MySqlJdbcTest test = new MySqlJdbcTest();
		test.init(new FileInputStream(new File("properties/config.properties")));
		test.fetch();
	}
}
