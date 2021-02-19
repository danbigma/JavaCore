package com.io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String args[]) throws IOException {
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";

		File file = new File("example.txt");
		if (file.exists()) {
			file.delete();
		}
		File file2 = new File("newfile.txt");
		// creates the file
		file.createNewFile();
		file2.createNewFile();
		// size of file
		int size = (int) file.length();
		System.out.println("File length - " + size + " byte");
		System.out.println("File newfile length - " + file2.length() + " byte");
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		writer.write(text);
		writer.flush();
		writer.close();
		// Creates a FileReader Object
		FileReader fr = new FileReader(file);
		char[] a = new char[text.toCharArray().length];
		fr.read(a); // reads the content to the array
		for (char c : a)
			System.out.print(c); // prints the characters one by one
		fr.close();
		System.out.println();
		System.out.println("File length after record - " + file.length() + " byte");
	}

}
