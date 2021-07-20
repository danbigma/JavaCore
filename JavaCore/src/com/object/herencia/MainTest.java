package com.object.herencia;

import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		EmployeePOJO employee = new EmployeePOJO("Danylo", "Bigma", "man", 100000);
		print(employee.toString());

		EmployeePOJO employee2 = new EmployeePOJO("Pedro", "Diez", "man", 100000);
		print(employee2.toString());

		EmployeePOJO employee3 = new EmployeePOJO("Pablo", "Escobar", "man", 10000000000L);
		print(employee3.toString());

		employee3.setSalary(200);
		print(employee3.toString());

		Client client = new Client("Danylo", "Bigma", "man", new Date(), "Everis");
		print(client.toString());

		Client client2 = new Client("Danylo", "Bigma", "man", new Date(), "Apple");
		print(client2.getFullname());
	}

	private static void print(String data) {
		System.out.println(data);
	}

}
