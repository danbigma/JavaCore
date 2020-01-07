package com.test.testclass;

public class ClassTesting {
	
	public int a;
	public int b;

	public ClassTesting() {
		System.out.println("Start empty constructor!");
		System.out.println("------------------------");
	}
	
	public ClassTesting(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Start constructor with two arguments!");
		System.out.println("------------------------");
	}
	
	// private method 
	public int sum() {
		return this.a + this.b;
	}
	
	// public method
	public void publicMethod() {
		System.out.println("Public method!");
		System.out.println("------------------------");
	}

}
