package com.test.file;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {
	public static void main(String[] args) throws IOException {
		File myObj = new File(Path.TEMPFOLDER.getPath());
		if (myObj.mkdir()) {
			System.out.println("Directory created: " + myObj.getName());
		} else {
			System.out.println("Directory already exists.");
		}
	}
}
