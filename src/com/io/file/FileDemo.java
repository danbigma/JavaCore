package com.io.file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = null;
		String[] strs = { "test1.txt", "test2.txt" };
		try {
			// for each string in string array
			for (String s : strs) {
				// create new file
				file = new File(s);
				file.createNewFile();
				// true if the file is executable
				boolean bool = file.canExecute();
				// find the absolute path
				String a = file.getAbsolutePath();
				// prints absolute path
				System.out.print(a);
				// prints
				System.out.println(" is executable: " + bool);
			}
		} catch (Exception e) {
			// if any I/O error occurs
			e.printStackTrace();
		}
	}
}
