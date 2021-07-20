package com.java8.streams;

public enum Genero {
	HOMBRE("H"), MUJER("M");
	
	private final String genero;

	Genero(String genero) {
		this.genero = genero; 
	}
	
	public String getGenero() {
		return genero;
	}
}
