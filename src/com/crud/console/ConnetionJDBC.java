package com.crud.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnetionJDBC {

	private static final String dbConnector = "jdbc:mysql:";
	private static final String dbHost   	= "localhost:";
	private static final String dbPort 	 	= "3306";
	private static final String dbTable  	= "students";
	
    private static final String USER     				= "root";
    private static final String PASSWORD 				= "12345678";
    private static final String UniformResourceLocator 	= dbConnector + "//" + dbHost + dbPort + "/" + dbTable;
    private static final String URL						= UniformResourceLocator;
    
	public Connection getConnection() {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}