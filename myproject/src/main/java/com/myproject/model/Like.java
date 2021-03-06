package com.myproject.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ideator.likes")
public class Like {

	
	@Id
	@Column(name = "like_id")
	private Long likeId;

	@Column(name = "is_like")
	private Boolean isLike;
	
	@Column(name = "created_date")
	private Timestamp creationTimestamp;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "user_id")
	private User userId;
	
	@Column(name = "trxn_id")
	private Long transactionId;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "post_id")
	private Post postId;

	/**
	 * 
	 */
	public Like() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the likeId
	 */
	public Long getLikeId() {
		return likeId;
	}

	/**
	 * @param likeId the likeId to set
	 */
	public void setLikeId(Long likeId) {
		this.likeId = likeId;
	}

	/**
	 * @return the isLike
	 */
	public Boolean getIsLike() {
		return isLike;
	}

	/**
	 * @param isLike the isLike to set
	 */
	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
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
		return "Like [likeId=" + likeId + ", isLike=" + isLike + ", creationTimestamp=" + creationTimestamp
				+ ", userId=" + userId + ", transactionId=" + transactionId + ", postId=" + postId + "]";
	}
	



}
