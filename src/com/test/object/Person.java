package com.test.object;

public class Person {

	private String firstname;
	private String lastname;
	private int age;
	private boolean smoke = false;

	// Empty constructor.
	public Person() {

	}

	// Constructor with parameters.
	public Person(String firstname, String lastname, int age, boolean smoke) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.smoke = smoke;
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

	private void validationFirstname(String firstname) {
		if (firstname == null || "".equals(firstname)) {
			throw new IllegalArgumentException("Firstname is invalid");
		}
	}

	private void validationLastname(String lastname) {
		if (lastname == null || "".equals(lastname)) {
			throw new IllegalArgumentException("Lastname is invalid");
		}
	}

	private void validationAge(int age) {
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
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", smoke=" + smoke + "]";
	}

}
