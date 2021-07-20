package com.exceptions;

public class JavaTesterThrow {
	
	public void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for voting");
		} else {
			print("Eligible for voting");
		}
	}

	public static void main(String[] args) {
		JavaTesterThrow obj = new JavaTesterThrow();
		obj.checkAge(13);
		print("End Of Program");
	}
	
	private static void print(Object out) {
		System.out.println(out);
	}
}

// Both throw and throws are the concepts of exception handing
// in which throw is used to explicitly throw an exception from
// a method or any block of code while throws are used in the signatur
// e of the method to indicate that this method might throw one of the
// listed type exceptions.
//
// The following are the important differences between throw and throws.