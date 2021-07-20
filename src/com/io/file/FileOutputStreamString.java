package com.io.file;

import java.io.FileOutputStream;

public class FileOutputStreamString {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("testout.txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
