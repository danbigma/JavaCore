package com.test.IO;

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
 * Класс BufferedInputStream накапливает вводимые данные в специальном буфере
 * без постоянного обращения к устройству ввода. Класс BufferedInputStream
 * */
