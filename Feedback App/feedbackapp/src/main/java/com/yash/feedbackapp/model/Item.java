package com.yash.feedbackapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Item Name is required")
	private String itemName;
	
	@NotBlank(message = "Item Image URL is required")
	private String itemImageURL;
	
	@NotBlank(message = "Item Identifier is required")
	@Size(min = 4, max = 5, message = "Please use 4 to 5 character")
	@Column(updatable = false, unique = true)
	private String itemIdentifier;
	
	/**
	 * This is mandatory, every model in Spring Boot MUST HAVE a Default Constructor
	 */
	public Item() {
		// TODO: This is a default constructor, is needed for generate Hibernate table.
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemImageURL() {
		return itemImageURL;
	}

	public void setItemImageURL(String itemImageURL) {
		this.itemImageURL = itemImageURL;
	}

	public String getItemIdentifier() {
		return itemIdentifier;
	}

	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemImageURL=" + itemImageURL + ", itemIdentifier="
				+ itemIdentifier + "]";
	}
	
	
}
