package com.test.json;

import java.io.File;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ParsingJson {

	public static void main(String[] args) throws Exception {

		File fileJSON = new File("data/countries.json");

		if (fileJSON.exists()) {
			JSONArray jsonObject = (JSONArray) UtilJSON.readJsonSimpleDemo(fileJSON.getAbsolutePath());
			for (int i = 0; jsonObject.size() > i; i++)
				System.out.println(jsonObject.get(i));
		} else {
			System.out.println("File does't exist!");
		}

		// parsingJSONtoObject(filename0);
	}

	@SuppressWarnings("unchecked")
	public static void parsingJSONtoObject(String filename) throws Exception {

		JSONObject jsonObject = (JSONObject) UtilJSON.readJsonSimpleDemo(filename);
		Person ben = new Person((String) jsonObject.get("name"), Integer.valueOf(jsonObject.get("age").toString()),
				(Boolean) jsonObject.get("isMarried"), (List<String>) jsonObject.get("hobbies"),
				(List<Person>) jsonObject.get("kids"));

		System.out.println(ben);
	}

}
