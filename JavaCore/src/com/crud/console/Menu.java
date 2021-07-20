package com.crud.console;

public class Menu {

	public void getMenu() {

		int counter = 1;

		StringBuilder menu = new StringBuilder();

		menu.append("Menu: \n");
		menu.append(counter++ + ". Add new user. \n");
		menu.append(counter++ + ". List of users. \n");
		menu.append(counter++ + ". Delete user. \n");
		menu.append(counter++ + ". Modif. user. \n");
		menu.append(counter++ + ". Exit. \n");
		menu.append("----------------- \n");
		menu.append("Please select.");

		System.out.println(menu);
	}

}
