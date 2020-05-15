package com.test.string;

//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
public class ConcatTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		// StringBuilder is better!
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
