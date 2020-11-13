package com.test.array;

public class ArrayMatrix {

	public static void main(String[] args) {

		showArrayMatrix(4, 5);

	}

	private static void showArrayMatrix(int number1, int number2) {
		int[][] matrix = new int[number1][number2];
		
		for (int i=0; i < number1; i++) {
			matrix[i][i] = (int) (Math.random() * 100);
			for (int j=0; j < number2; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < number1; i++) {
			System.out.println();
			for (int j = 0; j < number2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

		// System.out.println(ran);
	}

}
