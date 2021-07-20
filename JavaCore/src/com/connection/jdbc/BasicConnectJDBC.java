package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/students";
	private static final String USER = "root";
	private static final String PASSWORD = "12345678";
	private static int state = 404;

	// main method -->
	public static void main(String[] args) {
		try {
			Connection connection = getConnection();
			boolean connectionIsOpen = isOpenConnection(connection);
			getStateConnection(connectionIsOpen);
			closeConnection(connection);
		} catch (Exception e) {
			System.out.println("Fail connect database!");
		}
	}

	// close connection 
	private static void closeConnection(Connection connection) throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
	
	// check if connection is open
	private static boolean isOpenConnection(Connection connection) {
		boolean connectionIsOpen = false;
		if (connection != null) {
			state = 200; 
			connectionIsOpen = true;
		}
		return connectionIsOpen;
	}
	
	// check connection state 
	private static void getStateConnection(boolean connectionIsOpen) throws SQLException {
		if (connectionIsOpen && state == 200) {
			System.out.println("Connected to database!");
		}
	}

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
