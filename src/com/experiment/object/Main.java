package com.experiment.object;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstname("Danylo");
		person.setLastname("Bigma");
		
		Person person2 = new Person("Danylo", "Bigma", 28);
		
		System.out.println(person.toString());
		
		System.out.println(person.getFullName());
		
		System.out.println(person2.getFullName() + " " + person2.getAge() + " old.");
		
		System.out.println(person2.toString());
	}

}
