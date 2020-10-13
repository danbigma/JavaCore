package com.study.herencia;

import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		EmployeePOJO employee = new EmployeePOJO("Danylo", "Bigma", "man", 100000);
		System.out.println(employee.toString());

		EmployeePOJO employee2 = new EmployeePOJO("Pedro", "Diez", "man", 100000);
		System.out.println(employee2.toString());

		EmployeePOJO employee3 = new EmployeePOJO("Pablo", "Escobar", "man", 10000000000L);
		System.out.println(employee3.toString());

		employee3.setSalary(200);
		System.out.println(employee3.toString());

		Client client = new Client("Danylo", "Bigma", "man", new Date(), "Everis");
		System.out.println(client.toString());

		Client client2 = new Client("Danylo", "Bigma", "man", new Date(), "Apple");
		System.out.println(client2.toString());
	}

}
