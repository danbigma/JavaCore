package com.test.json;

import java.io.File;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ParsingJson {

	public static void main(String[] args) throws Exception {

		File fileJSON = new File("data/countries.json");
		String filename0 = fileJSON.getAbsolutePath();

		//readJSON(fileJSON, filename0);

		parsingJSONtoObject(filename0);

	}

	@SuppressWarnings("unchecked")
	public static void parsingJSONtoObject(String filename) throws Exception {

		JSONObject jsonObject = (JSONObject) UtilJSON.readJsonSimpleDemo(filename);
		JSONArray countriesArray = (JSONArray) jsonObject.get("Countries");
		
		for (int i = 0; i < countriesArray.size(); i++) {
			JSONObject countrieJSON = (JSONObject) countriesArray.get(i);
			Countrie countrie = new Countrie((String) countrieJSON.get("name"),(String) countrieJSON.get("code"),
					(String) countrieJSON.get("capital"), (String) countrieJSON.get("region"), (String) countrieJSON.get("flag"));
			System.out.println(countrie);
		}

//		Person ben = new Person((String) jsonObject.get("name"), Integer.valueOf(jsonObject.get("age").toString()),
//				(Boolean) jsonObject.get("isMarried"), (List<String>) jsonObject.get("hobbies"),
//				(List<Person>) jsonObject.get("kids"));

//		System.out.println(ben);
	}

	public static void readJSON(File fileJSON, String filename0) {
		if (fileJSON.exists()) {
			try {
				JSONObject jsonObject = (JSONObject) UtilJSON.readJsonSimpleDemo(filename0);
				System.out.println(jsonObject);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File is not exist!");
		}
	}

}
