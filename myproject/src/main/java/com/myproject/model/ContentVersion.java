package com.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.contentversion")
public class ContentVersion {

	@Id
	@Column(name = "contentversion_id")
	private Long contentVersionId;
	
	@Column(name = "is_disabled")
	private Boolean isDisabled;
	
	@Column(name = "attachment_id")
	private Long attachmentId;
	
	@Column(name = "trxn_id")
	private Long transactionId;

	@Column(name = "process_id")
	private Short processId;
	
	@Column(name = "linkedentity_id")
	private Short linkedEntityId;

	/**
	 * 
	 */
	public ContentVersion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the contentVersionId
	 */
	public Long getContentVersionId() {
		return contentVersionId;
	}

	/**
	 * @param contentVersionId the contentVersionId to set
	 */
	public void setContentVersionId(Long contentVersionId) {
		this.contentVersionId = contentVersionId;
	}

	/**
	 * @return the isDeleted
	 */
	public Boolean getIDisabled() {
		return isDisabled;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIDisabled(Boolean isDeleted) {
		this.isDisabled = isDeleted;
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
	 * @return the processId
	 */
	public Short getProcessId() {
		return processId;
	}

	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(Short processId) {
		this.processId = processId;
	}

	/**
	 * @return the linkedEntityId
	 */
	public Short getLinkedEntityId() {
		return linkedEntityId;
	}

	/**
	 * @param linkedEntityId the linkedEntityId to set
	 */
	public void setLinkedEntityId(Short linkedEntityId) {
		this.linkedEntityId = linkedEntityId;
	}

	@Override
	public String toString() {
		return "ContentVersion [contentVersionId=" + contentVersionId + ", isDeleted=" + isDisabled + ", attachmentId="
				+ attachmentId + ", transactionId=" + transactionId + ", processId=" + processId + ", linkedEntityId="
				+ linkedEntityId + "]";
	}


}
