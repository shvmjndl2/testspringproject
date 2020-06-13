package com.myproject.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.post")
public class Post {

	
	@Id
	@Column(name = "post_id")
	private Long postId;

	@Column(name = "post_desc")
	private String postDescription;
	
	@Column(name = "post_title")
	private String postTitle;
	
	@Column(name = "created_date")
	private Timestamp creationTimestamp;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "trxn_id")
	private Long transactionId;
	
	@Column(name = "content_id")
	private Long contentId;

	/**
	 * 
	 */
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the postId
	 */
	public Long getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Long postId) {
		this.postId = postId;
	}

	/**
	 * @return the postDescription
	 */
	public String getPostDescription() {
		return postDescription;
	}

	/**
	 * @param postDescription the postDescription to set
	 */
	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	/**
	 * @return the postTitle
	 */
	public String getPostTitle() {
		return postTitle;
	}

	/**
	 * @param postTitle the postTitle to set
	 */
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	/**
	 * @return the creationTimestamp
	 */
	public Timestamp getCreationTimestamp() {
		return creationTimestamp;
	}

	/**
	 * @param creationTimestamp the creationTimestamp to set
	 */
	public void setCreationTimestamp(Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the contentId
	 */
	public Long getContentId() {
		return contentId;
	}

	/**
	 * @param contentId the contentId to set
	 */
	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postDescription=" + postDescription + ", postTitle=" + postTitle
				+ ", creationTimestamp=" + creationTimestamp + ", userId=" + userId + ", transactionId=" + transactionId
				+ ", contentId=" + contentId + "]";
	}
	
	
}
