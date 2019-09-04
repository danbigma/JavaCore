package com.experiment.string;

import java.util.Random;

public class StringTest {

	public static void main(String[] args) {

		String string = "Lorem ipsum dolor sit amet," + " consectetur adipiscing elit."
				+ " Mauris mattis ex sit amet nisi " + "pretium, quis luctus quam euismod."
				+ " In nunc nisi, vehicula nec mauris eu," + " hendrerit lacinia risus. Aliquam erat volutpat."
				+ " Curabitur sed ex dui. Fusce ac hendrerit nisl."
				+ " Vestibulum bibendum nisi quis enim maximus facilisis."
				+ " Nullam in ex vehicula, scelerisque tortor a, porttitor nisl. "
				+ "Sed interdum, ligula ut tempor mollis, metus ipsum condimentum "
				+ "purus, at posuere nulla lectus non ex. Nunc rutrum sagittis ultrices."
				+ " Curabitur mattis turpis odio, eu fringilla quam mattis sed. Fusce eget pretium velit.";

		getRandomText(string);

	}

	private static void getRandomText(String string) {
		int symbolsOnString = string.length();

		System.out.println("Length - " + symbolsOnString);
		System.out.println("Firt letter - " + string.charAt(0));
		System.out.println("Last letter - " + string.charAt(symbolsOnString - 1));

		Random random = new Random();

		String[] arrayString = string.split(" ");

		System.out.println("Word in this string " + arrayString.length);
		System.out.println("------------------------------------------");

		for (int i = 0; i < 10; i++) {

			String randomWord = arrayString[random.nextInt(arrayString.length)];
			
			randomWord = randomWord.toLowerCase();
			
			if (randomWord.indexOf(",") > 0) {
				randomWord = randomWord.substring(0, randomWord.indexOf(","));
			}
			
			if (randomWord.indexOf(".") > 0) {
				randomWord = randomWord.substring(0, randomWord.indexOf("."));
			}
			
			if (i == 0 ) {
				String firstLetter = randomWord.substring(0, 1);
				randomWord = firstLetter.toUpperCase() + randomWord.substring(1);
			}
			
			System.out.print(randomWord + " ");
			
		}
	}

}