package com.pdf.PDDocument;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Main {

	private static final String fileSeparator = "file.separator";
	private static final String userDir = "file.separator";
	private static final String fileNamePDF = "blank.pdf";

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
			doc.save(System.getProperty(userDir) + System.getProperty(fileSeparator) + "data"
					+ System.getProperty(fileSeparator) + fileNamePDF);

			File filePDF = new File(System.getProperty(userDir) + System.getProperty(fileSeparator) + "data"
					+ System.getProperty(fileSeparator) + fileNamePDF);

			System.out.println("PDF created wiht name: " + filePDF.getName());
			// Closing the document
			doc.close();
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
	}

}
