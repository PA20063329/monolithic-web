package com.wipro.ClienUi.domain;

public class Item {
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
