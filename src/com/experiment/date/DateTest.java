package com.experiment.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
	    LocalDateTime myDateObj = LocalDateTime.now(); 
	    
	    System.out.println("Before formatting: " + myDateObj); 
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 

	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    System.out.println("After formatting: " + formattedDate);
	    
	    System.out.println("----------------------------------");
	    
	    myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    
	    formattedDate = myDateObj.format(myFormatObj);
	    
	    System.out.println("dd-MM-yyyy - " + formattedDate);
	    
	    System.out.println("----------------------------------");
	    
	    Date  newDate = new Date();
	    
	    System.out.println(newDate);

	}

}
