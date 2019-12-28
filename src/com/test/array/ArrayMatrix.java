package com.test.array;

public class ArrayMatrix {

	public static void main(String[] args) {

		showArrayMatrix(4,5);

	}

	private static void showArrayMatrix(int number1, int number2) {
		int[][] matrix = new int[number1][number2];

		matrix[0][0] = (int) (Math.random() * 100);
		matrix[0][1] = (int) (Math.random() * 100);
		matrix[0][2] = (int) (Math.random() * 100);
		matrix[0][3] = (int) (Math.random() * 100);
		matrix[0][4] = (int) (Math.random() * 100);

		matrix[1][0] = (int) (Math.random() * 100);
		matrix[1][1] = (int) (Math.random() * 100);
		matrix[1][2] = (int) (Math.random() * 100);
		matrix[1][3] = (int) (Math.random() * 100);
		matrix[1][4] = (int) (Math.random() * 100);

		matrix[2][0] = (int) (Math.random() * 100);
		matrix[2][1] = (int) (Math.random() * 100);
		matrix[2][2] = (int) (Math.random() * 100);
		matrix[2][3] = (int) (Math.random() * 100);
		matrix[2][4] = (int) (Math.random() * 100);

		matrix[3][0] = (int) (Math.random() * 100);
		matrix[3][1] = (int) (Math.random() * 100);
		matrix[3][2] = (int) (Math.random() * 100);
		matrix[3][3] = (int) (Math.random() * 100);
		matrix[3][4] = (int) (Math.random() * 100);

		for (int i = 0; i < number1; i++) {
			System.out.println();
			for (int j = 0; j < number2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

		// System.out.println(ran);
	}

}
