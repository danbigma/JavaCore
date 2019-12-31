package com.io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	public static void main(String args[]) throws IOException {
		File file = new File("example.txt");

		// creates the file
		file.createNewFile();

		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);

		// Writes the content to the file
		writer.write("This is an example");
		writer.flush();
		writer.close();

		// Creates a FileReader Object
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		fr.read(a); // reads the content to the array

		for (char c : a)
			System.out.print(c); // prints the characters one by one
		fr.close();
	}
}
