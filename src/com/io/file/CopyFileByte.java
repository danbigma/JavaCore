package com.io.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class CopyFileByte {
	
	private static final String INPUT = "data//input.txt";
	private static final String OUTPUT = "data//output.txt";
	
	public static void main(String args[]) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		String[] fileNames = {INPUT, OUTPUT};
		
		for (String f : fileNames) {
			File newfile = new File(f);
			if(newfile.exists()) {
				newfile.delete();
				newfile.createNewFile();
			} else {
				newfile.createNewFile();
			}
		}
		
		try {
			in = new FileReader(new File(fileNames[0]));
			out = new FileWriter(new File(fileNames[1]));

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
