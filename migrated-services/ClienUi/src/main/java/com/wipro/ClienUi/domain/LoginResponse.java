package com.wipro.ClienUi.domain;

public class LoginResponse {

	Integer userId;
	String userRole;
	Boolean loginStatus;
	
	public Boolean getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(Boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
