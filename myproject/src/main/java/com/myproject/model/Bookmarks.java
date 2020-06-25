package com.myproject.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ideator.bookmarks")
public class Bookmarks {

	
	@Id
	@Column(name = "bookmark_id")
	private Long bookmarkId;

	@Column(name = "is_deleted")
	private String isDeleted;

	@Column(name = "created_date")
	private Timestamp creationTimestamp;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id")
	private User userId;
	
	@Column(name = "trxn_id")
	private Long transactionId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "post_id")
	private Post postId;

	/**
	 * 
	 */
	public Bookmarks() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bookmarkId
	 */
	public Long getBookmarkId() {
		return bookmarkId;
	}

	/**
	 * @param bookmarkId the bookmarkId to set
	 */
	public void setBookmarkId(Long bookmarkId) {
		this.bookmarkId = bookmarkId;
	}

	/**
	 * @return the isDeleted
	 */
	public String getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
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
	public User getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(User userId) {
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
	 * @return the postId
	 */
	public Post getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Post postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Bookmarks [bookmarkId=" + bookmarkId + ", isDeleted=" + isDeleted + ", creationTimestamp="
				+ creationTimestamp + ", userId=" + userId + ", transactionId=" + transactionId + ", postId=" + postId
				+ "]";
	}

}
