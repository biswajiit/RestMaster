package com.restMaster.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtil {

	public static void parse(JSONObject obj) {
		obj.keySet().forEach(key -> {

			if (obj.get(key) instanceof JSONArray) {
				System.out.println("array");
			} else if (obj.get(key) instanceof JSONObject) {
				System.out.println(key);
				parse((JSONObject) obj.get(key));
			} else {
				System.out.println(key + "--" + obj.get(key));
			}
		});

	}

}
