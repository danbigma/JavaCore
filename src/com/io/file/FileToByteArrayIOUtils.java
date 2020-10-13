package com.io.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArrayIOUtils {
	public static void main(String[] args) {
		File file = new File("temp\\test.txt");
		// Using ApacheCommons methods
		readToByteArrayUsingCommons(file);
	}

	/**
	 * This method uses apache commons to read
	 * file content into a byte array
	 *
	 * @param file
	 */
	private static void readToByteArrayUsingCommons(File file) {
		try (FileInputStream fis = new FileInputStream(file)) {
			// Using IOUtils method, it takes FileInputStream
			// object as param
			byte[] bArray = IOUtils.toByteArray(fis);
			for (int i = 0; i < bArray.length; i++) {
				System.out.print((char) bArray[i]);
			}
			// Using FileUtils method, it takes file object
			// as param
			bArray = FileUtils.readFileToByteArray(file);
			//displaying byte array content
			for (int i = 0; i < bArray.length; i++) {
				System.out.print((char) bArray[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
