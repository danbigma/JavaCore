package com.experiment.string;

public class DynamicString {

	public static void main(String[] args) {
		
		constructDynamicString();

	}

	public static void constructDynamicString() {
		
		long startTime = System.currentTimeMillis();
		// String s = "test";
		StringBuffer s = new StringBuffer("test");
		// StringBuilder s = new StringBuilder("test");
		for (int i = 0; i < 100000; i++) {
			// s += "concat";
			s.append("concat");
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Concat time ====== " + (endTime - startTime));
	}

}
