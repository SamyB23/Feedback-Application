package com.yash.feedbackapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Feedback {
	/**
	 * Id of the review
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * Name of the user that gave the review
	 */
	@NotBlank(message = "Name is required")
	private String userName;
	/**
	 * Email of the user that gave the review
	 */
	@NotBlank(message = "Email is required")
	private String email;
	/**
	 * Item Identifier from item
	 */
	@NotBlank(message = "Feedback Identifier is required")
	@Size(min = 4, max = 5, message = "Please use 4 to 5 character")
	@Column(updatable = false, unique = true)
	private String feedbackIdentifier;
	/**
	 * Item Identifier is FK, link from Item.
	 */
	@NotBlank(message = "Item Identifier is required")
	private String itemIdentifier;
	/**
	 * Review of the item
	 */
	@NotBlank(message = "Review could not be empty")
	@Size(min = 5, max = 50)
	private String review;
	/**
	 * (Option) of the review photo
	 */
	@NotBlank(message = "Image URL is not found")
	private String photoURL;
	/**
	 * This is mandatory, every model in Spring Boot MUST HAVE a Default Constructor
	 */
	public Feedback() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	public String getFeedbackIdentifier() {
		return feedbackIdentifier;
	}
	public void setFeedbackIdentifier(String feedbackIdentifier) {
		this.feedbackIdentifier = feedbackIdentifier;
	}
	public String getItemIdentifier() {
		return itemIdentifier;
	}
	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", userName=" + userName + ", email=" + email + ", feedbackIdentifier="
				+ feedbackIdentifier + ", itemIdentifier=" + itemIdentifier + ", review=" + review + ", photoURL="
				+ photoURL + "]";
	}
	
	
	
}
