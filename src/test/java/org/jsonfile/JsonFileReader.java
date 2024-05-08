package org.jsonfile;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReader {
	
	static public void main(String... args) throws IOException, ParseException {
		
		FileReader FileReader=new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\JSONFileReader\\src\\test\\resources\\example.json");

		JSONParser JSONParser=new JSONParser();
		Object parse = JSONParser.parse(FileReader);
		JSONObject js=(JSONObject)parse;
		System.out.println(js.get("id"));
		System.out.println(js.get("type"));
		System.out.println(js.get("name"));
		System.out.println(js.get("ppu"));
		System.out.println(js.get("batters"));
		System.out.println(js.get("topping"));
		System.out.println(js.get("type"));
	}
}
