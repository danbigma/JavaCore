package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class BasicConnectJDBC {
	private static final String URL = "jdbc:mysql://localhost:3306/students";
	private static final String USER = "root";
	private static final String PASSWORD = "12345678";

	public static void main(String[] args) {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Connected to database!");
				connection.close();
			}
		} catch (Exception e) {
			System.out.println("Fail connect database!");
		}

	}
}
