package com.laboratory;

public class Raton extends DispositivosEntrada {

	private int idRaton;
	private static int contadorRatones;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
	}

	@Override
	public String toString() {
		return  super.toString() + "Raton [idRaton=" + idRaton + "]";
	}

	
}
