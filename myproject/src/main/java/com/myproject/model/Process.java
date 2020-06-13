package com.myproject.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.process")
public class Process {

	@Id
	@Column(name = "process_id")
	private Short processId;
	
	@Column(name = "process_name")
	private String processName;
	
	@Column(name = "crtn_tmstmp")
	private Timestamp createdDate;
	
	@Column(name = "is_active")
	private Boolean isActive;

	/**
	 * 
	 */
	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param processId
	 * @param processName
	 * @param createdDate
	 * @param isActive
	 */
	public Process(Short processId, String processName, Timestamp createdDate, Boolean isActive) {
		super();
		this.processId = processId;
		this.processName = processName;
		this.createdDate = createdDate;
		this.isActive = isActive;
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
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}

	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
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
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Process [processId=" + processId + ", processName=" + processName + ", createdDate=" + createdDate
				+ ", isActive=" + isActive + "]";
	}


}
