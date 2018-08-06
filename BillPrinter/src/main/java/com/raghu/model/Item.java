package com.raghu.model;

import org.springframework.data.annotation.Id;

public class Item {

	@Id
   String id;
   String name;
   String desc;
   String category;
   int price;
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

	
	
	
	
	
	
	
	
	
}
