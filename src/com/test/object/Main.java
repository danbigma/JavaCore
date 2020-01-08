package com.test.object;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstname("Danylo");
		person.setLastname("Bigma");
		person.setAge(29);
		person.setSmoke(true);
		
		person.publicVariable = "public variable"; // this is public field
		
		System.out.println(person.toString());
		System.out.println("---------------------------------------------");
		System.out.println(person.publicVariable);
		System.out.println("---------------------------------------------");
		
		Person person2 = new Person("Danylo", "Bigma", 29, true);
		System.out.println(person.getFullName());
		System.out.println(person2.getFullName() + " " + person2.getAge() + " old.");
		System.out.println(person2.toString());
	}

}
