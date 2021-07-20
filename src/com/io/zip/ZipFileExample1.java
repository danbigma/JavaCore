package com.io.zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileExample1 {

	private static final String FILE_SEPARATOR = "file.separator";
	private static final String USER_DIR = "user.dir";

	public static void main(String[] args) {

		Path source = Paths.get(System.getProperty(USER_DIR) + System.getProperty(FILE_SEPARATOR) + "data"
				+ System.getProperty(FILE_SEPARATOR) + "robots.txt");
		String zipFileName = "example.zip";

		try {
			ZipFileExample1.zipSingleFile(source, zipFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	// Zip a single file
	public static void zipSingleFile(Path source, String zipFileName) throws IOException {

		if (!Files.isRegularFile(source)) {
			System.err.println("Please provide a file.");
			return;
		}

		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(System.getProperty(USER_DIR)
				+ System.getProperty(FILE_SEPARATOR) + "data" + System.getProperty(FILE_SEPARATOR) + zipFileName));
				FileInputStream fis = new FileInputStream(source.toFile());) {

			ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
			zos.putNextEntry(zipEntry);

			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) > 0) {
				zos.write(buffer, 0, len);
			}
			zos.closeEntry();
		}
	}

}
