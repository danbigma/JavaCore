package com.io.file;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileDemo {
	
	private static final Logger logger = LogManager.getLogger(FileDemo.class);

	public static void main(String[] args) {
		File file = null;
		String[] strs = {"data//test1.txt", "data//test2.txt"};
		try {
			// for each string in string array
			for (String s : strs) {
				// create new file
				file = new File(s);
				if (file.exists()) {
					file.delete();
					file.createNewFile();
				}
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
			logger.debug(e.getMessage());
		}
	}

}
