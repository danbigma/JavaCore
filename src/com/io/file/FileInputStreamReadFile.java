package com.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReadFile {
	private static final String FILE_SEPARATOR = "file.separator";
	private static final String USER_DIR = "user.dir";
	private static final String FILE_NAME_TXT = "robots.txt";

	public static void main(String[] args) {
		File file = new File(System.getProperty(USER_DIR) + System.getProperty(FILE_SEPARATOR) + "data"
				+ System.getProperty(FILE_SEPARATOR) + FILE_NAME_TXT);
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);
			System.out.println("Total file size to read (in bytes) : " + fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
