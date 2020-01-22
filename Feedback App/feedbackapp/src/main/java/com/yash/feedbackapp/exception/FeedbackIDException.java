package com.yash.feedbackapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FeedbackIDException extends RuntimeException{

		public FeedbackIDException(){
			
		}
		public FeedbackIDException (String errorMessage) {
			super(errorMessage);
		}

}
