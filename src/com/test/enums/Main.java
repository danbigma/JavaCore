package com.test.enums;

public class Main {

	public static void main(String[] args) {

		System.out.println(Dias.MARTES);
		
		printDays();
	}

	private static void printDays() {
		for (Dias d : Dias.values()) {
			System.out.println("Day is " + d.getDiaDeLaSemana());
		}
	}

}
