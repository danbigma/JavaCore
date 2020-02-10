package com.io.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {

		String text = "Hello world!";
		try (FileOutputStream out = new FileOutputStream("notes.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			// to bytes
			byte[] buffer = text.getBytes();
			bos.write(buffer, 0, buffer.length);
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}

