package com.test.object;

public class Person {

	private String firstname;
	private String lastname;
	private int age;
	private boolean smoke = false;
	private static int counter;
	private int idPerson;
	public String publicVariable;
	private Contacts contacts;
	

	// Empty constructor with static variable
	public Person() {
		this.idPerson = ++counter;
	}

	// Constructor with parameters.
	public Person(String firstname, String lastname, int age, boolean smoke, Contacts contacts) {
		this();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.smoke = smoke;
		this.setContacts(contacts);
	}

	/********* Getters and Setters *********/

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		validationFirstname(firstname);
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		validationLastname(lastname);
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		validationAge(age);
		this.age = age;
	}

	// Method return full name of person.
	public String getFullName() {
		return this.firstname + " " + this.lastname;
	}

	public String sayHello() {
		return "Hello " + this.firstname;
	}

	private static void validationFirstname(String firstname) {
		if (firstname == null || "".equals(firstname)) {
			throw new IllegalArgumentException("Firstname is invalid");
		}
	}

	private static void validationLastname(String lastname) {
		if (lastname == null || "".equals(lastname)) {
			throw new IllegalArgumentException("Lastname is invalid");
		}
	}

	private static void validationAge(int age) {
		if (age < 1 || age > 100) {
			throw new IllegalArgumentException("Age is invalid");
		}
	}

	public boolean isSmoke() {
		return smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}
	
	public static int getCounter() {
		return counter;
	}
	

	public int getIdPerson() {
		return idPerson;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", smoke=" + smoke
				+ ", publicVariable=" + publicVariable + ", idPerson=" + idPerson + ", contacts" + contacts.toString() + "]";
	}
	

}
