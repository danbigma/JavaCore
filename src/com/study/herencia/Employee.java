package com.study.herencia;

public class Employee extends Person {
	
	private int idEmployee;
	private double salary;
	
	
	public Employee(String firstname, String lastname, String gender, int idEmployee, double salary) {
		super(firstname, lastname, gender);
		this.idEmployee = idEmployee;
		this.salary = salary;
	}

	public int getIdEmployee() {
		return idEmployee;
	}
	
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " Employee [idEmployee=" + idEmployee + ", salary=" + salary + "]";
	}
	
}
