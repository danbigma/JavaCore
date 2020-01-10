package com.study.herencia;

import java.util.Date;

public class MainTest {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Danylo", "Bigma", "man", 100000);
		System.out.println(employee.toString());
		
		Employee employee2 = new Employee("Pedro", "Diez", "man", 100000);
		System.out.println(employee2.toString());
		
		Employee employee3 = new Employee("Pablo", "Escobar", "man", 10000000000L);
		System.out.println(employee3.toString());
		
		employee3.setSalary(200);
		System.out.println(employee3.toString());
		
		Client client = new Client("Danylo", "Bigma", "man", new Date(), "Everis");
		System.out.println(client.toString());
		
		Client client2 = new Client("Danylo", "Bigma", "man", new Date(), "Apple");
		System.out.println(client2.toString());
	}

}
