package com.java8.lambda;

interface StringFun {
	String func(String str);
}

class MyStringOps {
	static String strReverse(String str) {
		String result = "";

		int i;

		for (i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}

		return result;
	}
}

public class MethodRef {

	static String stringOp(StringFun sf, String str) {
		return sf.func(str);
	}
	
	public static void main(String[] args) {
		
		String input = "Reverse";
		String output;
		
		System.out.println("Input string: " + input);
		
		output = stringOp(MyStringOps::strReverse, input);
		
		System.out.println("Output string: " + output);
	}
	
}
