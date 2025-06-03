package com.example.io;

public enum PathExample {

	TEMPFOLDER("tempfolder");

	private String path;

	private PathExample(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
}
