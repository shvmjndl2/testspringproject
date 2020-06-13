package com.myproject.model;

import java.sql.Timestamp;

import javax.json.JsonObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.transaction")
public class Transaction {

	@Id
	@Column(name = "trxn_id")
	private Long transactionId;
	
	@Column(name = "trxn_status")
	private char transactionStatus;
	
	@Column(name = "payload_json")
	private JsonObject payloadJson;
	
	@Column(name = "response_json")
	private JsonObject responseJson;
	
	@Column(name = "process_id")
	private Short processId;
	
	
	@Column(name = "crtn_tmstmp")
	private Timestamp createdDate;
	
	@Column(name = "crtd_by")
	private String createdBy;

	/**
	 * 
	 */
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param transactionId
	 * @param transactionStatus
	 * @param payloadJson
	 * @param responseJson
	 * @param processId
	 * @param createdDate
	 * @param createdBy
	 */
	public Transaction(Long transactionId, char transactionStatus, JsonObject payloadJson, JsonObject responseJson,
			Short processId, Timestamp createdDate, String createdBy) {
		super();
		this.transactionId = transactionId;
		this.transactionStatus = transactionStatus;
		this.payloadJson = payloadJson;
		this.responseJson = responseJson;
		this.processId = processId;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
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
	 * @return the transactionStatus
	 */
	public char getTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(char transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	/**
	 * @return the payloadJson
	 */
	public JsonObject getPayloadJson() {
		return payloadJson;
	}

	/**
	 * @param payloadJson the payloadJson to set
	 */
	public void setPayloadJson(JsonObject payloadJson) {
		this.payloadJson = payloadJson;
	}

	/**
	 * @return the responseJson
	 */
	public JsonObject getResponseJson() {
		return responseJson;
	}

	/**
	 * @param responseJson the responseJson to set
	 */
	public void setResponseJson(JsonObject responseJson) {
		this.responseJson = responseJson;
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
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionStatus=" + transactionStatus
				+ ", payloadJson=" + payloadJson + ", responseJson=" + responseJson + ", processId=" + processId
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + "]";
	}

	
	
}
