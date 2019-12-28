package com.test.properties;

import java.util.Properties;
import java.util.Set;

public class NameOS {

	private final static String osName = "os.name";
	private final static String userHome = "user.home";
	private final static String userDir = "user.dir";

	public static void main(String[] args) {

		String useOSname = System.getProperty(osName);
		String userHomeFolder = System.getProperty(userHome);
		String userDirectory = System.getProperty(userDir);

		System.out.println("You use - " + useOSname);
		System.out.println();
		System.out.println("User home folder - " + userHomeFolder);
		System.out.println();
		System.out.println("User dir - " + userDirectory);

		// System.getProperties().list(System.out);
		
		// Get System Defined Properties
		Properties systemProps = System.getProperties();
		Set<Object> keySet = systemProps.keySet();
		
		for(Object obj : keySet){
			String key = (String) obj;
			System.out.println("{"+obj+"="+systemProps.getProperty(key)+"}");
		}
		

	}

}
