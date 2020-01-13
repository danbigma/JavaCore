package com.test.enums;

public enum Dias {
	LUNES(1, "Lunes"),
	MARTES(2, "Martes"),
	MIERCOLES(3, "Miercoles"),
	JUEVES(4, "Jueves"),
	VIERNES(5, "Viernes"),
	SABADO(6, "Sabado"),
	DOMINGO(7, "Domingo");
	
	private final int numDiaDeLaSemana;
	private final String diaDeLaSemana;

	Dias(int num, String name) {
		this.numDiaDeLaSemana = num;
		this.diaDeLaSemana = name;
	}

	public int getNumDiaDeLaSemana() {
		return numDiaDeLaSemana;
	}

	public String getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
}
