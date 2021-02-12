package com.exceptions;

public class JavaTesterThrow {
	
	public void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for voting");
		} else {
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args) {
		JavaTesterThrow obj = new JavaTesterThrow();
		obj.checkAge(13);
		System.out.println("End Of Program");
	}
}

//Both throw and throws are the concepts of exception handing
//in which throw is used to explicitly throw an exception from
//a method or any block of code while throws are used in the signatur
//e of the method to indicate that this method might throw one of the
//listed type exceptions.
//
//The following are the important differences between throw and throws.