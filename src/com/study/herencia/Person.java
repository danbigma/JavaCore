package com.study.herencia;

public class Person {

	private String firstname;
	private String lastname;
	private String gender;
	
	
	public Person() {}

	public Person(String firstname, String lastname, String gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
	}
	
}
