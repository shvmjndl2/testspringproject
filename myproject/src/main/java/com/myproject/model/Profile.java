package com.myproject.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.profile")
public class Profile {

	@Id
	@Column(name = "profile_id")
	private Integer profileId;
	
	@Column(name = "profile_name")
	private String profileName;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "creation_date")
	private Timestamp createdDate;
	
	@Column(name = "created_by")
	private String createdBy;


	/**
	 * 
	 */
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param profileId
	 * @param profileName
	 * @param isActive
	 * @param createdDate
	 * @param createdBy
	 */
	public Profile(Integer profileId, String profileName, Boolean isActive, Timestamp createdDate, String createdBy) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}


	/**
	 * @return the profileId
	 */
	public Integer getProfileId() {
		return profileId;
	}


	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}


	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}


	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
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
		return "Profile [profileId=" + profileId + ", profileName=" + profileName + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + "]";
	}
	
	
	
}
