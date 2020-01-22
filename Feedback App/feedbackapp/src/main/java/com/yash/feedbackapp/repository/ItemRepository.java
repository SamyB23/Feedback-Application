package com.yash.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.feedbackapp.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
