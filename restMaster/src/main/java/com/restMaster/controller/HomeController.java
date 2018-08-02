package com.restMaster.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}

	@PostMapping("/template")
	public ResponseEntity<String> createRestTemplate(HttpEntity<String> httpEntity) {
		final String json = httpEntity.getBody();
		try {
			JSONObject obj = new JSONObject(json);
			System.out.println("valid json");
		} catch (final JSONException e) {
			System.out.println("not a valid Json");
			e.printStackTrace();
		}

		return null;
	}
}
