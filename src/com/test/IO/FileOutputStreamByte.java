package com.test.IO;

import java.io.FileOutputStream;

public class FileOutputStreamByte {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
