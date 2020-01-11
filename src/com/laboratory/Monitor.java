package com.laboratory;

public class Monitor {
	
	private final int idMonitor;
	private String marca;
	private double inch;
	private static int contadorMonitores;
	
	
	public Monitor() {
		idMonitor = ++contadorMonitores;
	}
	
	public Monitor(String marca, double size) {
		this();
		this.marca = marca;
		this.inch = size;
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
		return inch;
	}

	public void setSize(double size) {
		this.inch = size;
	}

	public static int getContadorMonitores() {
		return contadorMonitores;
	}
	
	
}
