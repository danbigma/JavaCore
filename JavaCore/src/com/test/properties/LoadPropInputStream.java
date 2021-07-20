package com.test.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropInputStream {
	public static void main(String[] args) {

		try (InputStream input = new FileInputStream("properties/config.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("db.url"));
			System.out.println(prop.getProperty("db.user"));
			System.out.println(prop.getProperty("db.password"));
			System.out.println("-----------------------------");

			prop.load(input);

			prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
			System.out.println("-----------------------------");

			prop.keySet().forEach(x -> System.out.println(x));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
