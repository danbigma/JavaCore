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
			System.out.println("Hoy es " + Dias.LUNES.getDiaDeLaSemana());
			break;
		case 2:
			System.out.println("Hoy es " + Dias.MARTES.getDiaDeLaSemana());
			break;
		case 3:
			System.out.println("Hoy es " + Dias.MIERCOLES.getDiaDeLaSemana());
			break;
		case 4:
			System.out.println("Hoy es " + Dias.JUEVES.getDiaDeLaSemana());
			break;
		case 5:
			System.out.println("Hoy es " + Dias.VIERNES.getDiaDeLaSemana());
			break;
		case 6:
			System.out.println("Hoy es " + Dias.SABADO.getDiaDeLaSemana());
			break;
		case 7:
			System.out.println("Hoy es " + Dias.DOMINGO.getDiaDeLaSemana());
			break;
		default:
			System.out.println("Day is not defind");
			break;
		}
		
		printDays();
		
	}

	private static void printDays() {
		for (Dias d : Dias.values()) {
			System.out.println("Día de la semana " + d.getDiaDeLaSemana());
		}
	}

}
