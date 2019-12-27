package com.experiment.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
	    LocalDateTime myDateObj = LocalDateTime.now(); 
	    
	    System.out.println("Before formatting: " + myDateObj); 
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 

	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    System.out.println("After formatting: " + formattedDate);
	    
	    System.out.println("----------------------------------");
	    
	    Date  newDate = new Date();
	    
	    System.out.println("Basic date format - " + newDate);
	    
	    System.out.println("----------------------------------");
	    
	    System.out.println("dd.MM.yyyy - " + convertDateWithDots(myDateObj));
	    
	    System.out.println("----------------------------------");
	    
	    System.out.println("dd-MM-yyyy - " + convertDateWithDashed(myDateObj));
	    
	    System.out.println("----------------------------------");
	    
	    System.out.println("dd/MM/yyyy - " + convertDateWithSlash(myDateObj));
	    
	    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(convertDateWithSlash(myDateObj));
	    System.out.println(date);  
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

}
