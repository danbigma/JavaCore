package com.study.herencia;

import java.util.Date;

public class Client extends Person {

	private int idClient;
	private String namecompany;
	private Date registered;
	private static int counter;


	public Client() {
		super();
	}

	public Client(String firstname, String lastname, String gender, Date registered, String namecompany) {
		super(firstname, lastname, gender);
		this.idClient = ++counter;
		this.namecompany = namecompany;
		this.registered = registered;
	}

	public String getNamecompany() {
		return namecompany;
	}

	public void setNamecompany(String namecompany) {
		this.namecompany = namecompany;
	}

	public Date getRegistered() {
		return registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	public int getIdClient() {
		return idClient;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return super.toString() + "Client [idClient=" + idClient + ", namecompany=" + namecompany + ", registered=" + registered + "]";
	}

}
