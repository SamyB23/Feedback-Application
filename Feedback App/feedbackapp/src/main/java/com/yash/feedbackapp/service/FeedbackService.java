package com.yash.feedbackapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.feedbackapp.exception.FeedbackIDException;
import com.yash.feedbackapp.model.Feedback;
import com.yash.feedbackapp.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	public Feedback saveOrUpdate(Feedback feedback) {
		// This save() is a build in method from CrudRepository() Spring Boot
				try {
					feedback.setFeedbackIdentifier(feedback.getFeedbackIdentifier().toUpperCase());
					return feedbackRepository.save(feedback);
				} catch (Exception ex){
					throw new FeedbackIDException("FeedbackIdentifier: "+feedback.getFeedbackIdentifier().toUpperCase()+" already exists");
				}
	}

	public Iterable<Feedback> findAll() {
		return feedbackRepository.findAll();
	}
}
