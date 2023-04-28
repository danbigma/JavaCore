package com.object.classtest;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {
	private static final Logger logger = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		// create a new instance of object Person
		Person person = new Person();// create new object of person
		// create a new instance of object Contacts
		Contacts contacts = new Contacts(633631113, "Calle Tomas Capelo 5, B2", "Alicante", "Spain");

		// Set value for variable of object
		person.setFirstname("Danylo");
		person.setLastname("Bigma");
		person.setAge(32);
		person.setSmoke(true);
		person.setContacts(contacts);

		person.publicVariable = "public variable";// this is public field

		logger.info(person);
		logger.info("---------------------------------------------");
		logger.info(person.publicVariable);
		logger.info("---------------------------------------------");

		// create a new instance of object Person
		Person person2 = new Person("Danylo", "Bigma", 29, true, contacts);
		logger.info(person.getFullName());
		logger.info("{}", person2.getFullName() + " " + person2.getAge() + " old.");
		logger.info(person2);

		logger.info("Counter {}", Person.getCounter());
	}

}
