package com.test.enums;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//System.out.println(Dias.MARTES);
		
		//printDays();
		
		todayIs(new Date());
	}

	private static void todayIs(Date date) {
		
		Date today = new Date(); // Fri Jun 17 14:54:28 PDT 2016
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		
		int numDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
		
		switch (numDay) {
		case 1:
			System.out.println(Dias.LUNES.getDiaDeLaSemana());
			break;
		case 2:
			System.out.println(Dias.MARTES.getDiaDeLaSemana());
			break;
		case 3:
			System.out.println(Dias.MIERCOLES.getDiaDeLaSemana());
			break;
		case 4:
			System.out.println(Dias.JUEVES.getDiaDeLaSemana());
			break;
		case 5:
			System.out.println(Dias.VIERNES.getDiaDeLaSemana());
			break;
		case 6:
			System.out.println(Dias.SABADO.getDiaDeLaSemana());
			break;
		case 7:
			System.out.println(Dias.DOMINGO.getDiaDeLaSemana());
			break;
		default:
			System.out.println("Day is not defind");
			break;
		}
		
	}

	private static void printDays() {
		for (Dias d : Dias.values()) {
			System.out.println("Day is " + d.getDiaDeLaSemana());
		}
	}

}
