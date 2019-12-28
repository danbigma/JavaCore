package com.test.file;

import java.io.File;

public class DeleteFolder {
	public static void main(String[] args) {
		File myObj = new File(Path.TEMPFOLDER.getPath());
		if (myObj.delete()) {
			System.out.println("Deleted the folder: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the folder.");
		}
	}
}
