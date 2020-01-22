package com.yash.feedbackapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.feedbackapp.service.ItemService;
import com.yash.feedbackapp.service.MapValidationErrorService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	@Autowired
	public MapValidationErrorService mapValidationErrorService;
	@RequestMapping("/index")
	public String itemIndex() {
		return "itemIndex";
	}
	@RequestMapping("/create")
	public String createItem() {
		return "itemIndex";
	}

}
