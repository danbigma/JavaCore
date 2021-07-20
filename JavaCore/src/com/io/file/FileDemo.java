package com.io.file;

import java.io.File;
import java.io.FileWriter;
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
		String text = "Hello from Java joputa! WTF?!";
		
		deleteFilesIfExists(strs);
		createFilesWithNames(strs);
		writeToFile(text, strs[0]);
	}

	private static void createFilesWithNames(String[] filenames) {
		try {
			// for each string in string array
			for (String s : filenames) {
				// create new file
				File file = new File(s);
				if (!file.exists()) {
					boolean fileCreated = file.createNewFile();
					if (fileCreated) {
						System.out.println("File was been created with name: " + file.getName());
						sleepSystem(1000);
					}
					// true if the file is executable
					boolean setExecute = file.setExecutable(true);
					if (setExecute) {
						System.out.println("File " + file.getName() + " change to executable.");
						sleepSystem(1000);
					}
					boolean isExecute = file.canExecute();
					// find the absolute path
					String absolutePath = file.getAbsolutePath();
					// prints absolute path
					System.out.print("Path > " + absolutePath);
					// prints
					System.out.println(" is executable: " + isExecute);
				}
			}
		} catch (Exception e) {
			// if any I/O error occurs
			logger.error(e.getMessage());
		}
	}
	
	private static void writeToFile(String text, String filaname) {
		try(FileWriter file = new FileWriter(new File(filaname))) {
			file.write(text);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}

	private static void deleteFilesIfExists(String[] files) throws IOException {
		for (String f : files) {
			Path path = Paths.get(System.getProperty("user.dir") + System.getProperty("file.separator") + f);
			String filename = path.getFileName().toString();
			boolean isDeleted = cleanUp(path);
			if (isDeleted) {
				System.out.println("File " + filename + " was deleted correctly.");
				sleepSystem(1000);
			}
		}
	}

	private static boolean cleanUp(Path path) throws IOException {
		return Files.deleteIfExists(path);
	}

	private static void sleepSystem(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			System.out.println("Thread.sleep(1000) > error");
		}
	}

}
