package com.test.string;

public class ReverseString {
	public static void main(String[] args) {

		String reversed = reverseString("Reverse string recursion");
		System.out.println("reverse (recursion) - " + reversed);

		String reverseItr = reverseItr("Reverse string non recursive");
		System.out.println("reverse (non recursive) - " + reverseItr);
	}

	// Using recursion
	private static String reverseString(String str) {
		// validation & base case
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}
		// recursive call
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	// Using iteration - Non Recursive
	private static String reverseItr(String str) {
		// validation
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
