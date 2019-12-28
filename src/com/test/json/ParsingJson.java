package com.test.json;

import java.util.List;

import org.json.simple.JSONObject;

public class ParsingJson {

	public static void main(String[] args) throws Exception {
		
		String filename0 = "/Users/daniilbigma/dev/workspace_Eclipse/JavaCore/src/com/experiment/json/example--2.json";
		
		JSONObject jsonObject = (JSONObject) UtilJSON.readJsonSimpleDemo(filename0);
		System.out.println(jsonObject);
		
		//parsingJSONtoObject(filename0);		

	}
	
	public static void parsingJSONtoObject(String filename) throws Exception {
		
	    JSONObject jsonObject = (JSONObject) UtilJSON.readJsonSimpleDemo(filename);
	    Person ben = new Person(
	                (String) jsonObject.get("name"),
	                Integer.valueOf(jsonObject.get("age").toString()),
	                (Boolean) jsonObject.get("isMarried"),
	                (List<String>) jsonObject.get("hobbies"),
	                (List<Person>) jsonObject.get("kids"));

	    System.out.println(ben);
	}


}
