package com.experiment.string;

public class DynamicString {

	public static void main(String[] args) {
		
		System.out.println("StringNormal-------------");
		constructDynamicStringNormal();
		System.out.println("-------------------------");
		
		System.out.println("StringBuffer-------------");		
		constructDynamicStringBuffer();
		System.out.println("-------------------------");
		
		System.out.println("StringBuilder------------");
		constructDynamicStringBuilder();
		System.out.println("-------------------------");

	}

	public static void constructDynamicStringNormal() {
		
		long startTime = System.currentTimeMillis();
		
		String s = "test";
		
		for (int i = 0; i < 100000; i++) {
			s += "concat";
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Concat time ====== " + (endTime - startTime));
	}
	
	public static void constructDynamicStringBuffer() {
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer s = new StringBuffer("test");

		for (int i = 0; i < 100000; i++) {
			s.append("concat");
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Concat time ====== " + (endTime - startTime));
	}
	
	public static void constructDynamicStringBuilder() {
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder s = new StringBuilder("test");
		
		for (int i = 0; i < 100000; i++) {
			s.append("concat");
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Concat time ====== " + (endTime - startTime));
	}

}
