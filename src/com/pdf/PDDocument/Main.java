package com.pdf.PDDocument;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Main {

	public static void main(String[] args) {
		PDDocument doc = new PDDocument();
		try {
			// Creating PDF document object
			for (int i = 0; i < 5; i++) {
				// Creating a blank page
				PDPage blankPage = new PDPage();
				// Adding the blank page to the document
				doc.addPage(blankPage);
			}
			// Saving the document
			doc.save("C:\\dev\\GIT_local\\JavaCore\\data\\blank.pdf");
			
			File filePDF = new File("C:\\dev\\GIT_local\\JavaCore\\data\\blank.pdf");
			
			System.out.println("PDF created wiht name: " + filePDF.getName());
			// Closing the document
			doc.close();
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
	}

}
