package com.test.json;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;

public class UtilJSON {
	
	public static Object readJsonSimpleDemo(String filename) throws Exception {
		FileReader reader = new FileReader(filename);
		JSONParser jsonParser = new JSONParser();
		return jsonParser.parse(reader);
	}
	
}
