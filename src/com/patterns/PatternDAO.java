package com.patterns;

public class PatternDAO {
	public static void main(String[] args) {
		Data getdate = new FileSystem();
		System.out.println(getdate.getData());
	}
}

interface Data {
	String getData() ;
}

class DB implements Data {

	public String getDataFromDB() {
		return "Get data from FileSystem";
	}

	@Override
	public String getData() {
		return getDataFromDB();
	}
	
}

class FileSystem implements Data {
	
	public String getDataFromFS() {
		return "Get data from FileSystem";
	}

	@Override
	public String getData() {
		return getDataFromFS();
	}
	
}
