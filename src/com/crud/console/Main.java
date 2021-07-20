package com.crud.console;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = null;
		boolean start = true;
		String exit = "n";

		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Scanner fail!");
		}

		Menu menu = new Menu();
		Function function = new Function();

		do {
			menu.getMenu();
			int action = scanner.nextInt();

			switch (action) {
			case 1:
				function.addNewUser();
				break;
			case 2:
				function.listUsers();
				break;
			case 3:
				function.deleteUser();
				break;
			case 4:
				function.modifUser();
				break;
			case 5:
				System.out.println("Are you sure y/n ?");
				exit = scanner.next();
				if ("y".equals(exit)) {
					start = false;
				} else {
					start = true;
				}
				break;
			default:
				break;
			}

		} while (start);

	}

}
