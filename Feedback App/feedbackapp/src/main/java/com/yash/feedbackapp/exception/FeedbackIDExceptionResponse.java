package com.yash.feedbackapp.exception;

public class FeedbackIDExceptionResponse {
	
	private String feedbackIdentifier;
	
	public FeedbackIDExceptionResponse(String feedbackIdentifier) {
		this.setFeedbackIdentifier(feedbackIdentifier);
	}

	public String getFeedbackIdentifier() {
		return feedbackIdentifier;
	}

	public void setFeedbackIdentifier(String feedbackIdentifier) {
		this.feedbackIdentifier = feedbackIdentifier;
	}
	
	
	
}
