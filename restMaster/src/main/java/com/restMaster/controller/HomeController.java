package com.restMaster.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restMaster.dtos.JsonEntity;
import com.restMaster.utils.JsonUtil;

@RestController
public class HomeController {

	@Autowired
	JsonUtil util;

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

	@PostMapping("/template")
	public ResponseEntity<List<JsonEntity>> createRestTemplate(@RequestBody String body) throws JSONException {
		List<JsonEntity> entityList = new ArrayList<>();
		if (body.startsWith("[")) {
			JSONArray obj = new JSONArray(body);
			entityList = util.parse(obj);
		} else {
			JSONObject obj = new JSONObject(body);
			entityList = util.parse(obj);
		}
		return new ResponseEntity<List<JsonEntity>>(entityList, HttpStatus.OK);
	}
}
