package com.cheer.mini.shoppingcar.model;

import com.cheer.mini.base.util.StringUtil;

public class Shoppingcar {

	private String orderlistId = StringUtil.createUUID();
	
	private int number;

	public String getOrderlistId() {
		return orderlistId;
	}

	public void setOrderlistId(String orderlistId) {
		this.orderlistId = orderlistId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
