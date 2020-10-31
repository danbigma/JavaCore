package com.object.testclass;

public class ClassTesting {

	public int a;
	public int b;
	
	public static final String divided = "------------------------";

	public ClassTesting() {
		System.out.println("Start empty constructor!");
		System.out.println(divided);
	}

	public ClassTesting(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Start constructor with two arguments!");
		System.out.println(divided);
	}

	// private method 
	public int sum() {
		return this.a + this.b;
	}

	public int subtract() {
		return this.a - this.b;
	}

	public int multiply() {
		return this.a * this.b;
	}

	public int divide() {
		return this.a / this.b;
	}

	// public method
	public void publicMethod() {
		System.out.println("Public method!");
		System.out.println(divided);
	}

}
