package com.wipro.ClienUi.domain;

public class SaveCredentialResponse {
	
	Integer savedId;
	Boolean status;
	
	public Integer getSavedId() {
		return savedId;
	}
	public void setSavedId(Integer savedId) {
		this.savedId = savedId;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
