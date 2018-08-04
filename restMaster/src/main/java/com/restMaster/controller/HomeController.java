package com.restMaster.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restMaster.utils.JsonUtil;

@RestController
public class HomeController {

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

	@PostMapping("/template")
	public ResponseEntity<String> createRestTemplate(@RequestBody String body) {
		JSONObject obj = new JSONObject(body);
		JsonUtil.parse(obj);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
}
