package org.jsonfile;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReaderTwo {
static public void main(String... args) throws IOException, ParseException {
		
		FileReader FileReader=new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\JSONFileReader\\src\\test\\resources\\example.json");

		JSONParser JSONParser=new JSONParser();
		Object parse = JSONParser.parse(FileReader);
		JSONObject js=(JSONObject)parse;
		System.out.println(js.get("id"));
		System.out.println(js.get("type"));
		System.out.println(js.get("name"));
		System.out.println(js.get("ppu"));
		
		Object object = js.get("batters");
		JSONObject jSONObject=(JSONObject)object;
		Object object2 = jSONObject.get("batter");
		JSONArray  jSONArray=(JSONArray)object2;
		for(int i=0;i<jSONArray.size();i++) {
		Object object3 = jSONArray.get(i);
		JSONObject jSONObject3=(JSONObject)object3;
		System.out.println(jSONObject3.get("id"));
		System.out.println(jSONObject3.get("type"));
		}
	Object object3 = js.get("topping");
		JSONArray JSONArray1=(JSONArray)object3;
		for(int i=0;i<JSONArray1.size();i++){
			Object object4 = JSONArray1.get(i);
			JSONObject jSONObject4=(JSONObject)object4;
			System.out.println(jSONObject4.get("id"));
			System.out.println(jSONObject4.get("type"));
			System.out.println(jSONObject4.get("id")+"\t"+jSONObject4.get("type"));
		}
	}
}

