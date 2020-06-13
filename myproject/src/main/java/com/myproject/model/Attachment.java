package com.myproject.model;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.attachments")
public class Attachment {

	@Id
	@Column(name = "attachment_id")
	private Long attachmentId;
	
	@Column(name = "is_disabled")
	private Boolean isDisabled;
	
	@Column(name = "trxn_id")
	private Long transactionId;

	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "content_type")
	private String contentType;

	@Column(name = "created_date")
	private Timestamp creationTimestamp;
	
	@Column(name = "attachment_data")
	private Blob attachmentData;

	/**
	 * 
	 */
	public Attachment() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the attachmentId
	 */
	public Long getAttachmentId() {
		return attachmentId;
	}

	/**
	 * @param attachmentId the attachmentId to set
	 */
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

	/**
	 * @return the isDisabled
	 */
	public Boolean getIsDisabled() {
		return isDisabled;
	}

	/**
	 * @param isDisabled the isDisabled to set
	 */
	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
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
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
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
	 * @return the attachmentData
	 */
	public Blob getAttachmentData() {
		return attachmentData;
	}

	/**
	 * @param attachmentData the attachmentData to set
	 */
	public void setAttachmentData(Blob attachmentData) {
		this.attachmentData = attachmentData;
	}


}
