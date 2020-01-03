package com.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArrayOfBytesToFile {
	private static final String UPLOAD_FOLDER = "temp\\";

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;

		try {

			File file = new File("temp\\testing1.txt");
			byte[] bFile = new byte[(int) file.length()];

			// read file into bytes[]
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);

			// save bytes[] into a file
			writeBytesToFile(bFile, UPLOAD_FOLDER + "test1.txt");
			writeBytesToFileClassic(bFile, UPLOAD_FOLDER + "test2.txt");
			writeBytesToFileNio(bFile, UPLOAD_FOLDER + "test3.txt");

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	// Classic, < JDK7
	private static void writeBytesToFileClassic(byte[] bFile, String fileDest) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(fileDest);
			fos.write(bFile);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// Since JDK 7 - try resources
	private static void writeBytesToFile(byte[] bFile, String fileDest) {

		try (FileOutputStream fileOuputStream = new FileOutputStream(fileDest)) {
			fileOuputStream.write(bFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Since JDK 7, NIO
	private static void writeBytesToFileNio(byte[] bFile, String fileDest) {

		try {
			Path path = Paths.get(fileDest);
			Files.write(path, bFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
