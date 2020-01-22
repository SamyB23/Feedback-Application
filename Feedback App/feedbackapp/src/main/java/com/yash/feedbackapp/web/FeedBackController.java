package com.yash.feedbackapp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.feedbackapp.model.Feedback;
import com.yash.feedbackapp.service.FeedbackService;
import com.yash.feedbackapp.service.MapValidationErrorService;

@Controller
@RequestMapping("/feedback")
public class FeedBackController {
	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	@RequestMapping("/index")
	public String feedBackHome(){
		return "feedbackHome";
	}
	@RequestMapping("/feedbackForm")
	public String feedBackIndex(){
		return "feedbackForm";
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createProject(@Valid @RequestBody Feedback feedback, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.ValidationError(result);
		if (errorMap != null)
			return errorMap;
		return new ResponseEntity<Feedback>(feedbackService.saveOrUpdate(feedback), HttpStatus.CREATED);
		
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllProject(){
		return new ResponseEntity<Iterable<Feedback>>(feedbackService.findAll(), HttpStatus.OK);
	}
}
