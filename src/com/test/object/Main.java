package com.test.object;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstname("Danylo");
		person.setLastname("Bigma");
		person.setAge(29);
		
		Person person2 = new Person("Danylo", "Bigma", 29);
		
		System.out.println(person.toString());
		
		System.out.println(person.getFullName());
		
		System.out.println(person2.getFullName() + " " + person2.getAge() + " old.");
		
		System.out.println(person2.toString());
	}

}
