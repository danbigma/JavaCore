package com.experiment.file;

import java.io.File;

public class CreateFile {
	
	private static final String PATH = "/Users/daniilbigma/dev/workspace_Eclipse/JavaCore";
	
	public static void main(String[] args) {
		
		File directory = new File(PATH);
		
		if (!directory.exists()) {
			System.out.println("Directory does not exist!");
			return;
		}

	}

}
