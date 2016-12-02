package com.cheer.mini.shoppingcar.model;

import java.util.List;

public class MyShoppingCart {

	private String pid;
	private String pname;
	private String image;
	private double price;
	private int number;
	private double subtotal;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSubtotal() {
		return number * price;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

}
