package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	private static final int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final List<Integer> fixesSizeList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	private static final List<String> list = new ArrayList<>();

	static {
		System.out.println("Execute first!");
		System.out.println("----------------------------");
		
		for (int i = 0; i <= 10; i++) {
			list.add("String " + i);
		}
	}

	public static void main(String[] args) {

		// printForeach(fixesSizeList);
		// printForeach(arr);
		// printFor(arr);

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("----------------------------");
		for (String i : cars) {
			System.out.println(i);
		}
		
	}

	private static void printForeach(List<Integer> fixesSizeList) {
		System.out.println("Method - printForeach");
		System.out.println();
		// foreach
		for (int i : fixesSizeList) {
			System.out.println("Number - " + i);
		}
		System.out.println("----------------------------------------");

	}

	private static void printForeach(int[] arr) {
		System.out.println("Method - printForeach");
		System.out.println();
		// foreach
		for (int i : arr) {
			System.out.println("Number - " + i);
		}
		System.out.println("----------------------------------------");
	}

	private static void printFor(int[] arr) {
		System.out.println("Method - printFor");
		System.out.println();
		// for normal
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Number - " + arr[i]);
		}
		System.out.println("----------------------------------------");
	}

}
