package com.test.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlJdbcTest {
	private final static String driverClass = "com.mysql.jdbc.Driver";

	Connection con;

	public void init(FileInputStream fs)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(fs);
		String url = props.getProperty("db.url");
		String userName = props.getProperty("db.user");
		String password = props.getProperty("db.password");
		Class.forName(driverClass);

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
