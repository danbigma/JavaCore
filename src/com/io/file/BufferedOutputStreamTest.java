package com.io.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {

		String text = "Hello world!"; // �?трока дл�? запи�?и
		try (FileOutputStream out = new FileOutputStream("notes.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			// перевод �?троки в байты
			byte[] buffer = text.getBytes();
			bos.write(buffer, 0, buffer.length);
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}

/** 
 * Кла�?�? BufferedOutputStream аналогично �?оздает буфер дл�? потоков вывода.
 * Этот буфер накапливает выводимые байты без по�?то�?нного обращени�? к у�?трой�?тву.
 * И когда буфер заполнен, производит�?�? запи�?ь данных.
 * */
