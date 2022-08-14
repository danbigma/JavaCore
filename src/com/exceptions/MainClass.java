package com.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {

	private static final String DATABASE_EXCEPTION = "DATABASE_EXCEPTION";
	private static final Logger logger = LogManager.getLogger(MainClass.class);

	public static void main(String[] args) {
		try {
			makeDatabaseConnection();
		} catch (HandledException e) {
			// Display custom message to the user
			String message = "Code: " + e.getCode() + " Exception Message : " + e.getMessage();
			logger.error(message);
			// Log the exception detail
			logger.error("Exception: ", e);
		}
	}

	static void makeDatabaseConnection() throws HandledException {
		String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
		String userName = "sa";
		String password = "secret";
		try (Connection conn = DriverManager.getConnection(dbURL, userName, password)) {
			logger.info("Connection successfully");
		} catch (SQLException e) {
			throw new HandledException(DATABASE_EXCEPTION, "Failed to connect to database", e);
		}
	}

}