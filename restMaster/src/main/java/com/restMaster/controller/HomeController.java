package com.restMaster.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PostMapping
	public ResponseEntity<String> createRestTemplate(HttpEntity<String> httpEntity) {

		return null;
	}
}
