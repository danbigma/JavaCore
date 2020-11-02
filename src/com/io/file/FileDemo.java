package com.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileDemo {

	private static final Logger logger = LogManager.getLogger(FileDemo.class);

	public static void main(String[] args) throws IOException {
		String[] strs = { "data//test1.txt", "data//test2.txt" };

		deleteFilesIfExists(strs);
		createFilesWithNames(strs);

	}

	private static void createFilesWithNames(String[] filenames) {
		try {
			// for each string in string array
			for (String s : filenames) {
				// create new file
				File file = new File(s);
				if (!file.exists()) {
					boolean fileCreated = file.createNewFile();
					if (fileCreated)
						System.out.println("File was been created with name: " + file.getName());
					// true if the file is executable
					boolean setExecute = file.setExecutable(true);
					if (setExecute) {
						System.out.println("File " + file.getName() + "change to executable.");
					}
					boolean isExecute = file.canExecute();
					// find the absolute path
					String a = file.getAbsolutePath();
					// prints absolute path
					System.out.print(a);
					// prints
					System.out.println(" is executable: " + isExecute);
				}
			}
		} catch (Exception e) {
			// if any I/O error occurs
			logger.debug(e.getMessage());
		}
	}

	private static void deleteFilesIfExists(String[] files) throws IOException {
		for (String f : files) {
			Path path = Paths.get(System.getProperty("user.dir") + System.getProperty("file.separator") + f);
			String filename = path.getFileName().toString();
			boolean isDeleted = cleanUp(path);
			if (isDeleted) {
				System.out.println("File " + filename + " was deleted correctly.");
			}
		}
	}

	private static boolean cleanUp(Path path) throws IOException {
		return Files.deleteIfExists(path);
	}

}
