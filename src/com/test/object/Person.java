package com.test.object;

public class Person {
	
	private String firstname;
	private String lastname;
	private int age;
	
	// Empty constructor.
	public Person() {
		
	}
	
	// Constructor with parameters.
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	/********* Getters and Setters *********/

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Method return full name of person.
	public String getFullName() {
		return this.firstname + " " + this.lastname;
	}
	
	public String sayHello() {
		return "Hello " + this.firstname; 
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
		
}
