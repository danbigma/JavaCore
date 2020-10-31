package com.object.classtest;

public class Contacts {

	private int phoneNumber;
	private String address;
	private String city;
	private String country;


	public Contacts(int phoneNumber, String address, String city, String country) {
		super();// extends of Object, first object in java and very important
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Contacts [phoneNumber=" + phoneNumber + ", address=" + address + ", city=" + city + ", country="
				+ country + "]";
	}


}
