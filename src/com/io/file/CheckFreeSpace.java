package com.io.file;

import java.io.File;


public class CheckFreeSpace {

	private static final String PATH = "/";

	public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String homeDirectory = System.getProperty("user.home");
        String separator = System.getProperty("file.separator");

        print("You use - " + osName);
        print("Username is - " + userName);
        print("Your home directory - " + homeDirectory);
        print("System separator - " + separator);

        //System.getProperties().list(System.out);

        getFreeSpaceHardDisk(PATH);
    }

	private static void getFreeSpaceHardDisk(String path) {
        File file = new File(path);
        if (!file.exists()) {
            print("Path incorrect!");
            return;
        }

        long b = file.getFreeSpace();
        long kb = b / 1024;
        long mg = kb / 1024;
        long gb = mg / 1024;

        print("--------------------------------------------");
        print("Byte - " + b + " b");
        print("Kilobyte - " + kb + " kb");
        print("Megabyte - " + mg + " mb");
        print("Gigabyte - " + gb + " gb");
        print("--------------------------------------------");
        print("Free space in bytes - " + file.getFreeSpace() + " b");
        print("--------------------------------------------");

    }
	
	private static void print(String out) {
		if ("".equals(out) && out == null) {
			return;
		}
		System.out.println(out);
	}
}
