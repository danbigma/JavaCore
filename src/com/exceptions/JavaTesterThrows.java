package com.exceptions;

public class JavaTesterThrows {
	public int division(int a, int b) throws ArithmeticException {
		int t = a / b;
		return t;
	}

	public static void main(String[] args) {
		JavaTesterThrows obj = new JavaTesterThrows();
		try {
			System.out.println(obj.division(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("You shouldn't divide number by zero");
		}
	}
}

// Both throw and throws are the concepts of exception handing
// in which throw is used to explicitly throw an exception from
// a method or any block of code while throws are used in the signatur
// e of the method to indicate that this method might throw one of the
// listed type exceptions.
//
// The following are the important differences between throw and throws.