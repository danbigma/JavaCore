package com.laboratory;

public class MundoPC {

	public static void main(String[] args) {
		// creacion de computadora Toshiba
		Monitor monitorToshi = new Monitor("Toshiba", 13);
		Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
		Raton ratonToshi = new Raton("bluetooth", "Toshiba");
		Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

		// creacion de computadora dell
		Monitor monitorDell = new Monitor("Dell", 15);
		Teclado tecladoDell = new Teclado("usb", "Dell");
		Raton ratonDell = new Raton("usb", "Dell");
		Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

		// creacion de computadora armada
		Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);
		
		Monitor monitorApple = new Monitor("Apple", 1000);
		Teclado tecladoApple = new Teclado("bluetooth", "Apple");
		Raton ratonApple = new Raton("bluetooth", "Apple");
		
		// creacion de computadora apple
		Computadora compuApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);

		// Agregamos las computadoras a la orden
		Orden orden1 = new Orden();
		orden1.agregarComputadora(compuToshiba);
		orden1.agregarComputadora(compuDell);
		orden1.agregarComputadora(compuArmada);
		orden1.agregarComputadora(compuApple);
		// Imprimimos la orden
		orden1.mostrarOrden();

		// Agregamos una segunda orden
		Orden orden2 = new Orden();
		orden2.agregarComputadora(compuArmada);
		orden2.agregarComputadora(compuDell);
		System.out.println("");
		orden2.mostrarOrden();
	}

}
