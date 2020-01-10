package com.laboratory;

public class Monitor {
	
	private final int idMonitor;
	private String marca;
	private double size;
	private static int contadorMonitores;
	
	
	public Monitor() {
		idMonitor = ++contadorMonitores;
	}
	
	public Monitor(String marca, double size) {
		this();
		this.marca = marca;
		this.size = size;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public static int getContadorMonitores() {
		return contadorMonitores;
	}
	
	
}
