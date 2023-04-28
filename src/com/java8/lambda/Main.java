package com.java8.lambda;


public class Main {
	public static void main(String[] args) {
		
		// lambda operator -> body
		
		// () -> System.out.println("Zero parameter lambda");
		// (n) -> System.out.println("One parameter: " + n)
		// (n1, n2) -> System.out.println("Multiple parameters: " + n1 + ", " + n2);

		// (n) -> {} expression body
		
		// Block lambda expression
		SomeType reverse = (param1) -> { // expression body
			String result = "";
			int i;
			
			for (i = param1.length() - 1; i >= 0; i--) {
				result += param1.charAt(i);
			}
			return result;
		};
		
		// send lambda first parameter
		System.out.println(stringOp(reverse, "Reverse"));
		// send lambda like a first parameter
		System.out.println(stringOp((n) -> n.toUpperCase(), "Reverse"));
	
	}
	
	static Object stringOp(SomeType fn, String s) {
		return fn.func(s);
	}
}
