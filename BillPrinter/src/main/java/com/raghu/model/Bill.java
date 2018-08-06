package com.raghu.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Bill {
	@Id
	String id;
	int n;
	ArrayList<Item> items=new ArrayList<Item>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
