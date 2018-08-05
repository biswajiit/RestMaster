package com.restMaster.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.restMaster.dtos.JsonEntity;

public class JsonUtil {

	private static final String MAX_LENGTH = "99";
	private static final String TYPE_OBJECT = "Object";
	private static final String TYPE_STRING = "String";
	private static final String TYPE_ARRAY = "Array";

	public static List<JsonEntity> parse(JSONObject obj) {

		List<JsonEntity> entityList = new ArrayList<>();
		obj.keySet().forEach(key -> {

			if (obj.get(key) instanceof JSONArray) {
				JsonEntity entity = new JsonEntity();
				List<JsonEntity> list = parse(obj.get(key));
				entity.setValues(list);
				entity.setType(TYPE_ARRAY);
				entityList.add(entity);
			} else if (obj.get(key) instanceof JSONObject) {
				JsonEntity entity = new JsonEntity();
				entity.setName(key);
				entity.setType(TYPE_OBJECT);
				List<JsonEntity> list = parse((JSONObject) obj.get(key));
				entity.setValues(list);
				entityList.add(entity);
			} else {
				JsonEntity entity = new JsonEntity();
				entity.setMax_length(MAX_LENGTH);
				entity.setMin_length(String.valueOf(obj.get(key).toString().length()));
				entity.setName(key);
				entity.setType(TYPE_STRING);
				entityList.add(entity);
			}
		});

		return entityList;
	}

	private static List<JsonEntity> parse(Object obj) {
		JSONArray jsonArray = (JSONArray) obj;
		List<JsonEntity> entityList = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			if (jsonArray.get(i) instanceof JSONObject) {
				JsonEntity entity = new JsonEntity();
				entity.setType(TYPE_OBJECT);
				List<JsonEntity> list = parse((JSONObject) jsonArray.get(i));
				entity.setValues(list);
				entityList.add(entity);
			} else {
				JsonEntity entity = new JsonEntity();
				entity.setMax_length(MAX_LENGTH);
				entity.setMin_length(String.valueOf(jsonArray.get(i).toString().length()));
				entity.setName(jsonArray.get(i).toString());
				entity.setType(TYPE_STRING);
				entityList.add(entity);
			}
		}
		return entityList;
	}

}
