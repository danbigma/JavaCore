package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/students";
	private static final String USER = "root";
	private static final String PASSWORD = "12345678";

	public static void main(String[] args) {
		try {
			Connection connection = getConnection();
			if (isOpenConnection(connection)) {
				System.out.println("Connected to database!");
				closeConnection(connection);
			}
		} catch (Exception e) {
			System.out.println("Fail connect database!");
		}
	}

	private static void closeConnection(Connection connection) throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	private static boolean isOpenConnection(Connection connection) {
		boolean open = false;
		if (connection != null) {
			open = true;
		}
		return open;
	}

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
