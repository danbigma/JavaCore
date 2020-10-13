package com.test.string;

public class DynamicString {

	public static void main(String[] args) {

		System.out.println("String-Normal-------------");
		constructDynamicStringNormal();
		System.out.println("--------------------------");
		// ---------------------------------------------
		System.out.println("String-Buffer-------------");
		constructDynamicStringBuffer();
		System.out.println("--------------------------");
		// ---------------------------------------------
		System.out.println("String-Builder------------");
		constructDynamicStringBuilder();
		System.out.println("--------------------------");
		// ---------------------------------------------
	}

	@SuppressWarnings("unused")
	public static void constructDynamicStringNormal() {
		long startTime = System.currentTimeMillis();
		String s = "test";

		for (int i = 0; i < 100000; i++) {
			s += "concat";
		}

		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);

		System.out.println("Concat time ====== " + totalTime);
	}

	public static void constructDynamicStringBuffer() {
		long startTime = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("test");

		for (int i = 0; i < 100000; i++) {
			s.append("concat");
		}

		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);

		System.out.println("Concat time ====== " + totalTime);
	}

	public static void constructDynamicStringBuilder() {
		long startTime = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("test");

		for (int i = 0; i < 100000; i++) {
			s.append("concat");
		}

		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);

		System.out.println("Concat time ====== " + totalTime);
	}

}
