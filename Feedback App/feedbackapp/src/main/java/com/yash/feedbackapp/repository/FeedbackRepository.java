package com.yash.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.feedbackapp.model.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long>{

}
