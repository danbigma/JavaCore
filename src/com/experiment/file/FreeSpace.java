package com.experiment.file;

import java.io.File;

public class FreeSpace {

	private static final String PATH = "/";

	public static void main(String[] args) {

		getFreeSpaceHardDisk(PATH);

	}

	private static void getFreeSpaceHardDisk(String path) {

		File file = new File(path);

		if (!file.exists() && !file.isDirectory()) {
			System.out.println("Path does not exist or !");
			return;
		}

		long b = file.getFreeSpace();
		long kb = b / 1024;
		long mg = kb / 1024;
		long gb = mg / 1024;

		System.out.println("--------------------------------------------");
		System.out.println("Byte - " + b + "b");
		System.out.println("Kilobyte - " + kb + "kb");
		System.out.println("Megabyte - " + mg + "mb");
		System.out.println("Gigabyte - " + gb + "gb");
		System.out.println("--------------------------------------------");
		System.out.println("Free space in bytes - " + file.getFreeSpace() + "b");
		System.out.println("--------------------------------------------");

	}

}
