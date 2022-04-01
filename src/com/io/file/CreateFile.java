package com.io.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	private static final Logger logger = LogManager.getLogger(CreateFile.class);
	public static void main(String[] args) {

		try {
			File myObj = new File("plainfile.txt");
			if (myObj.createNewFile()) {
				String message = "File created: " + myObj.getName();
				logger.info(message);
			} else {
				logger.info("File already exists.");
			}
		} catch (IOException e) {
			logger.error("An error occurred.");
			e.printStackTrace();
		}
	}
}
