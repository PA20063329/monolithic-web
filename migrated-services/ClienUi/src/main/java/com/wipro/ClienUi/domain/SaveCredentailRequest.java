package com.wipro.ClienUi.domain;

public class SaveCredentailRequest {

	Integer id;
	String userName;
	String emailAddress;
	String account;
	String password;
	Integer userId;
	
	public SaveCredentailRequest() {
		super();
	}

	public SaveCredentailRequest(Integer id, String userName, String emailAddress, String account, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.account = account;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
