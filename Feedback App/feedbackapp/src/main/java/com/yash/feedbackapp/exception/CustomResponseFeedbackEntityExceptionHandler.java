package com.yash.feedbackapp.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomResponseFeedbackEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler
	public final ResponseEntity<Object> responseFeedbackIDException(FeedbackIDException ex, WebRequest request){
		FeedbackIDExceptionResponse feedbackIDExceptionResponse = new FeedbackIDExceptionResponse(ex.getMessage());
		return new ResponseEntity(feedbackIDExceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
