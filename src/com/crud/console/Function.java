package com.crud.console;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Function {

	public Map<Integer, Integer> listUsers() {

		Map<Integer, Integer> usersmap = new HashMap<>();

		ConnetionJDBC connectionJDBC = new ConnetionJDBC();
		Connection connection = connectionJDBC.getConnection();

		ResultSet resultset = null;

		String query = "SELECT * FROM PERSONS";

		String result = "";
		Integer id = null;

		try (Statement statement = connection.createStatement()) {
			resultset = statement.executeQuery(query);

			System.out.println("--------------List of users--------------");
			if (resultset != null) {
				int counter = 1;
				while (resultset.next()) {
					id = resultset.getInt("ID");
					result = resultset.getString("LASTNAME");
					usersmap.put(counter, id);
					System.out.println(counter++ + ". " + result);
				}
			}
			System.out.println("-----------------------------------------");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		return usersmap;
	}

	public void addNewUser() {
		Scanner scanner = null;
		String name = "";

		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Error scanner " + e.getMessage());
		}

		System.out.print("Please enter name of the new user: ");

		try {
			name = validScanner(scanner);
		} catch (Exception e) {
			System.out.println("Exception scanner " + e.getMessage());
		}

		if (name != null) {
			saveNewUser(name);
		}

	}

	public void deleteUser() {

		Scanner scanner = null;

		ConnetionJDBC connectionJDBC = new ConnetionJDBC();
		Connection connection = connectionJDBC.getConnection();

		PreparedStatement statement = null;

		int key = 0;

		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Error scanner " + e.getMessage());
		}

		Map<Integer, Integer> usersmap = listUsers();

		System.out.print("Delete user number - ");

		boolean isInt = false;

		do {
			if (scanner.hasNextInt()) {
				key = scanner.nextInt();
				isInt = true;
			} else {
				scanner = new Scanner(System.in);
			}
		} while (!isInt);

		int id = usersmap.get(key);

		String sql = "DELETE FROM PERSONS WHERE ID = ?";

		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void modifUser() {

		Scanner scanner = null;

		ConnetionJDBC connectionJDBC = new ConnetionJDBC();
		Connection connection = connectionJDBC.getConnection();

		PreparedStatement statement = null;

		int key = 0;

		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Error scanner " + e.getMessage());
		}

		Map<Integer, Integer> usersmap = listUsers();
		System.out.print("Modif user number - ");

		boolean isInt = false;

		do {
			if (scanner.hasNextInt()) {
				key = scanner.nextInt();
				isInt = true;
			} else {
				scanner = new Scanner(System.in);
			}
		} while (!isInt);

		int id = usersmap.get(key);

		System.out.print("New name: ");
		String newName = scanner.next();

		String sql = "UPDATE PERSONS SET LASTNAME = ? WHERE ID = ? ";

		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, newName);
			statement.setInt(2, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void saveNewUser(String name) {

		ConnetionJDBC connectionJDBC = new ConnetionJDBC();
		Connection connection = connectionJDBC.getConnection();

		PreparedStatement statement = null;

		String sql = "INSERT INTO PERSONS (LASTNAME) VALUES (?)";

		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.executeUpdate();
			System.out.println(name + " user add to database");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static String validScanner(Scanner scanner) {
		if (scanner == null) {
			throw new IllegalArgumentException("The Scanner argument cannot be null");
		}
		return scanner.next();
	}

}
