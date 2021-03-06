package com.object.herencia;

public class EmployeePOJO extends Person {

	private int idEmployee;
	private double salary;
	private static int counter;

	public EmployeePOJO(String firstname, String lastname, String gender, double salary) {
		super(firstname, lastname, gender);
		this.idEmployee = ++counter;
		this.salary = salary;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return super.toString() + " Employee [idEmployee=" + idEmployee + ", salary=" + salary + "]";
	}

}
