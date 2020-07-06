package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBD {

	private static final String CONNECTOR 	= "jdbc:";
	private static final String DATA_BASE 	= "mysql:";
	private static final String HOST 		= "localhost:";
	private static final String PORT 		= "3306";
	private static final String TABLE 		= "web_student_tracker";
	private static final String USER 		= "root";
	private static final String PASSWORD 	= "12345678";
	// private static final String useSSL = "?useSSL=false&amp";

	private static final String TIME_ZOME = "serverTimezone=UTC";

	private static final String UNIFORM_RESOURCE_LOCATOR = CONNECTOR + DATA_BASE + "//" + HOST + PORT + "/" + TABLE
			+ "?" + TIME_ZOME;
	private static final String URL = UNIFORM_RESOURCE_LOCATOR;

	public static void main(String[] args) {
		Connection connection = getConnection();
		closeConnection(connection);
	}

	private static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Connected to database!");
			}
		} catch (Exception e) {
			System.out.println("Fail to connect to database!");
			System.out.println("Error: " + e.getMessage());
		}
		return connection;
	}

	private static void closeConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
				System.out.println("Connection is closed.");
			}
		} catch (SQLException e) {
			System.out.println("Faile to closed the connection");
			System.out.println("Message: " + e.getMessage().toString());
		}
	}

}
