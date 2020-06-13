package com.myproject.model;

import java.sql.Date;

import javax.json.JsonObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ideator.user")
public class User {

	@Id
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "full_name")
	private String userName;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "trxn_id")
	private Long transactionId;
	
	@Column(name = "county")
	private String country;
	
	@Column(name = "pincode")
	private int pincode;
	
	@Column(name = "interest")
	private JsonObject interest;
	
	@Column(name = "is_tandc")
	private Boolean isTac;
	
	@Column(name = "profile_id")
	private Integer profileId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Long userId, String userName, Date dob, String email, String password, Long transactionId,
			String country, int pincode, JsonObject interest, Boolean isTac, Integer profileId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.transactionId = transactionId;
		this.country = country;
		this.pincode = pincode;
		this.interest = interest;
		this.isTac = isTac;
		this.profileId = profileId;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public JsonObject getInterest() {
		return interest;
	}

	public void setInterest(JsonObject interest) {
		this.interest = interest;
	}

	public Boolean getIsTac() {
		return isTac;
	}

	public void setIsTac(Boolean isTac) {
		this.isTac = isTac;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", email=" + email + ", password="
				+ password + ", transactionId=" + transactionId + ", country=" + country + ", pincode=" + pincode
				+ ", interest=" + interest + ", isTac=" + isTac + ", profileId=" + profileId + "]";
	}
	
	
	
	
}
