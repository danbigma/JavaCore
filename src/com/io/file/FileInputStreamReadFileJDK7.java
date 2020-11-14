package com.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReadFileJDK7 {
	private static final String fileSeparator = "file.separator";
	private static final String userDir = "file.separator";
	private static final String fileNameTXT = "robots.txt";

	public static void main(String[] args) {
		File file = new File("data" + System.getProperty(fileSeparator) + fileNameTXT);

		try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("Total file size to read (in bytes) : "+ fis.available());
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
