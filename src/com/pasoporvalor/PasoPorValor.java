package com.pasoporvalor;

public class PasoPorValor {
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("x = " + x);
		
		cambioValor(x); // pasamos el valor x
		
		System.out.println("x = " + x); // el valor no se cambió 
	}
	
	private static void cambioValor(int arg1) { // recibe una copia del valor x
		System.out.println("arg1 = " + arg1);
		
		arg1 = 15;
		 
		System.out.println("arg1 = " + arg1);
	}

}
