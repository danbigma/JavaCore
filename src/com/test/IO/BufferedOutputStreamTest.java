package com.test.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {

		String text = "Hello world!"; // строка для записи
		try (FileOutputStream out = new FileOutputStream("notes.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			// перевод строки в байты
			byte[] buffer = text.getBytes();
			bos.write(buffer, 0, buffer.length);
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}

/** 
 * Класс BufferedOutputStream аналогично создает буфер для потоков вывода.
 * Этот буфер накапливает выводимые байты без постоянного обращения к устройству.
 * И когда буфер заполнен, производится запись данных.
 * */
