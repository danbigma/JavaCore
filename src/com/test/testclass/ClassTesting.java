package com.test.testclass;

public class ClassTesting {

	public ClassTesting() {
		System.out.println("Start empty constructor!");
		System.out.println("------------------------");
	}
	
	public ClassTesting(int a, int b) {
		System.out.println("Start constructor with two arguments!");
		System.out.println(a+b);
		System.out.println("------------------------");
	}
	
	// private method 
	private int sum(int a, int b) {
		return a+b;
	}
	
	// public method
	public void publicMethod() {
		System.out.println("Public method!");
		System.out.println("------------------------");
	}

}
