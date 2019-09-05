package com.experiment.array;

public class ArrayMatrix {

	public static void main(String[] args) {

		int[][] matrix = new int[4][5];

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

		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

		// System.out.println(ran);

	}

}
