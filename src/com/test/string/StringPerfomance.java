package com.test.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringPerfomance {
	
	private static final Logger logger = LogManager.getLogger(StringPerfomance.class);
	
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		
		// Concatenation
		for (int i = 0; i < 1000000; i++) {
			String s = "Hi " + i + "; Hi to you " + i * 2;
		}
		long end = System.currentTimeMillis();
		System.out.println("Concatenation = " + (end - start) + " millisecond");

		// String.format
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			String s = String.format("Hi %s; Hi to you %s", i, +i * 2);
		}
		end = System.currentTimeMillis();
		System.out.println("Format = " + (end - start) + " millisecond");
		
		// StringBuilder
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			StringBuilder bldString = new StringBuilder("Hi ");
			bldString.append(i).append("; Hi to you ").append(i * 2);
		}
		end = System.currentTimeMillis();
		System.out.println("String Builder = " + ((end - start)) + " millisecond");
	}
}
