package com.restMaster.common;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	private static final String JSON_EXCEPTION = "Not a valid JSON";

	@ExceptionHandler(JSONException.class)
	public ResponseEntity<String> jsonException() {
		return new ResponseEntity<String>(JSON_EXCEPTION, HttpStatus.OK);
	}
}
