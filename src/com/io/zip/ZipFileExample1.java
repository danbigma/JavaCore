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

	public static void main(String[] args) {

		Path source = Paths.get(System.getProperty("user.dir") + System.getProperty("file.separator") + "data/foo.txt");
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

		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName));
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
