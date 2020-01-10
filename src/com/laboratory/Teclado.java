package com.laboratory;

public class Teclado extends DispositivosEntrada {

	private int idTeclado;
	private static int contadorTeclados;
	
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++contadorTeclados;
	}
	
	
}
