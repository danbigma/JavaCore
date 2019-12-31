package com.io.file;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamTest {
	public static void main(String[] args) {

		String text = "Hello world!";
		byte[] buffer = text.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(buffer);

		try (BufferedInputStream bis = new BufferedInputStream(in)) {

			int c;
			while ((c = bis.read()) != -1) {

				System.out.print((char) c);
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}

/** 
 * Кла�?�? BufferedInputStream накапливает вводимые данные в �?пециальном буфере
 * без по�?то�?нного обращени�? к у�?трой�?тву ввода. Кла�?�? BufferedInputStream
 * */

