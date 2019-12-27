package com.experiment.properties;

public class NameOS {

	private final static String osName = "os.name";
	private final static String userHome = "user.home";

	public static void main(String[] args) {

		String useOSname = System.getProperty(osName);
		String userHomeFolder = System.getProperty(userHome);

		System.out.println("You use - " + useOSname);
		System.out.println();
		System.out.println("User home folder - " + userHomeFolder);
		System.out.println();

		System.getProperties().list(System.out);

	}

}
