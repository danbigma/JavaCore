package com.io.file;

import java.io.File;

public class CheckFreeSpace {
	private static final String PATH = "/";

	public static void main(String[] args) {
		
		String osName 			= System.getProperty("os.name");
		String userName 		= System.getProperty("user.name");
		String homeDirectory 	= System.getProperty("user.home");
		
		System.out.println("You use - " + osName);
		System.out.println("Username is - " + userName);
		System.out.println("Your home directory - " + homeDirectory);

		getFreeSpaceHardDisk(PATH);

	}

	private static void getFreeSpaceHardDisk(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("Path incorrect!");
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
