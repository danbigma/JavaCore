package com.experiment.properties;

public class NameOS {

	private final static String osNamePropertie = "os.name";

	public static void main(String[] args) {

		String useOSname = System.getProperty(osNamePropertie);

		System.out.println("You use - " + useOSname);

		System.getProperties().list(System.out);

	}

}
