package com.test.object;

public class Main {

	public static void main(String[] args) {
		
		// create a new instance of object Person
		Person person = new Person();// create new object of person
		// create a new instance of object Contacts
		Contacts contacts = new Contacts(633631113, "Pintor Perez Gil 13 bw 28", "Alicante", "Spain");
		
		// Set value for variable of object
		person.setFirstname("Danylo");
		person.setLastname("Bigma");
		person.setAge(29);
		person.setSmoke(true);
		person.setContacts(contacts);
		
		person.publicVariable = "public variable"; // this is public field
		
		System.out.println(person.toString());
		System.out.println("---------------------------------------------");
		System.out.println(person.publicVariable);
		System.out.println("---------------------------------------------");
		
		
		// create a new instance of object Person
		Person person2 = new Person("Danylo", "Bigma", 29, true, contacts);
		System.out.println(person.getFullName());
		System.out.println(person2.getFullName() + " " + person2.getAge() + " old.");
		System.out.println(person2.toString());
		
		System.out.println("Counter " + Person.getCounter());
		
	}

	
}
