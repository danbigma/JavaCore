package com.test.array;

public class Array {

	private static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {

		printForeach(arr);
		printFor(arr);

	}

	private static void printForeach(int[] arr) {
		System.out.println("Method - printForeach");
		System.out.println();
		for (int i : arr) {
			System.out.println("Number - " + i);
		}
		System.out.println("----------------------------------------");
	}

	private static void printFor(int[] arr) {
		System.out.println("Method - printFor");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Number - " + arr[i]);
		}
		System.out.println("----------------------------------------");
	}

}
