package com.example.item.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 176689245833032083L;

	@Id
	@GeneratedValue
	Long id;
	
	String itemName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + "]";
	}
	
	
}
