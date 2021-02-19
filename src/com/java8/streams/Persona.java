package com.java8.streams;

import java.util.List;

public class Persona {
	private String nombre;
	private int edad;
	private Genero genero;
	private List<Integer> telefonos;

	public Persona(String nombre, int edad, Genero genero, List<Integer> telefonos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.telefonos = telefonos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Integer> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Integer> telefonos) {
		this.telefonos = telefonos;
	}
}
