package com.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.interest")
public class Interest {

	@Id
	@Column(name = "interest_id")
	private Integer interestId;
	
	@Column(name = "interest_desc")
	private String interestDescription;

	/**
	 * 
	 */
	public Interest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the interestId
	 */
	public Integer getInterestId() {
		return interestId;
	}

	/**
	 * @param interestId the interestId to set
	 */
	public void setInterestId(Integer interestId) {
		this.interestId = interestId;
	}

	/**
	 * @return the interestDescription
	 */
	public String getInterestDescription() {
		return interestDescription;
	}

	/**
	 * @param interestDescription the interestDescription to set
	 */
	public void setInterestDescription(String interestDescription) {
		this.interestDescription = interestDescription;
	}

	@Override
	public String toString() {
		return "Interest [interestId=" + interestId + ", interestDescription=" + interestDescription + "]";
	}
	
	
}
