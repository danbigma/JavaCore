package com.io.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class CopyFileByte {
	
	private static final String FILE_SEPARATOR = "file.separator";
	private static final String USER_DIR = "user.dir";

	private static final String INPUT = System.getProperty(USER_DIR) + System.getProperty(FILE_SEPARATOR) + "data"
			+ System.getProperty(FILE_SEPARATOR) + "Lorem.txt";
	private static final String OUTPUT = System.getProperty(USER_DIR) + System.getProperty(FILE_SEPARATOR) + "data"
			+ System.getProperty(FILE_SEPARATOR) + "output.txt";

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		String[] fileNames = { INPUT, OUTPUT };

		try {
			in = new FileReader(new File(fileNames[0]));
			out = new FileWriter(new File(fileNames[1]));

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
