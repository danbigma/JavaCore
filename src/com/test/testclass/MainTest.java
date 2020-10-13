package com.test.testclass;

public class MainTest {

	public static void main(String[] args) {
		int argmA = 22;
		int argmB = 5;

		ClassTesting firstclass = new ClassTesting();

		firstclass.publicMethod();

		ClassTesting secondclass = new ClassTesting(argmA, argmB);
		System.out.println("Sum - " + secondclass.sum());
		System.out.println("Subtract - " + secondclass.subtract());
		System.out.println("Multiply - " + secondclass.multiply());
		System.out.println("Divide - " + secondclass.divide());
	}

}
