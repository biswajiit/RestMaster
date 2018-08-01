package com.restMaster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restMaster.dtos.Model;

@RestController
public class HomeController {

	@PostMapping
	public ResponseEntity<String> createRestTemplate(@RequestBody Model model) {

		return null;
	}
}
