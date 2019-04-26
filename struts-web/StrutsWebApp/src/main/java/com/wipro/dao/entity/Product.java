package com.wipro.dao.entity;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2587684166989725627L;

	Long id;
	
	String prodName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	@Override
	public String toString() {
		return id + " " + prodName;
	}
}
