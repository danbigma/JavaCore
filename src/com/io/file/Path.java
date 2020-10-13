package com.io.file;

public enum Path {

	TEMPFOLDER("tempfolder");

	private String path;

	private Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
}
