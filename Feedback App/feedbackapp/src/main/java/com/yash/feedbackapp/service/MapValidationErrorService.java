package com.yash.feedbackapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
/**
 * This class was created to take out any errors from controller, and map the errors to corresponse HttpStatus
 * @author kdluu
 *
 */
@Service
public class MapValidationErrorService {
	public ResponseEntity<?> ValidationError(BindingResult result) {
		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<>();
			for (FieldError fieldError : result.getFieldErrors()) {
				errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);

		} else
			return null;
	}
}
