package com.test.date;

import com.test.url.GetWebElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	private static final Logger logger = LogManager.getLogger(DateTest.class);

	public static void main(String[] args) throws ParseException {

		LocalDateTime myDateObj = LocalDateTime.now();
		print("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);

		print("After formatting: " + formattedDate);
		print("----------------------------------");

		Date newDate = new Date();
		print("Basic date format - " + newDate);
		print("----------------------------------");
		print("dd.MM.yyyy - " + convertDateWithDots(myDateObj));
		print("----------------------------------");
		print("dd-MM-yyyy - " + convertDateWithDashed(myDateObj));
		print("----------------------------------");
		print("dd/MM/yyyy - " + convertDateWithSlash(myDateObj));

		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(convertDateWithSlash(myDateObj));
		print(date);
		print("----------------------------------");
	}

	// convert date to date with special format with dots  
	private static String convertDateWithDots(LocalDateTime date) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		return date.format(myFormatObj);
	}

	// convert date to date with special format with dashed 
	private static String convertDateWithDashed(LocalDateTime date) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return date.format(myFormatObj);
	}

	// convert date to date with special format with slash
	private static String convertDateWithSlash(LocalDateTime date) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(myFormatObj);
	}
	
	private static void print(Object out) {
		logger.info(out);
	}

}
