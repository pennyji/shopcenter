package com.cheer.mini.shoppingcar.model;

public class MyShoppingCart {

	private String pname;
	private double price;
	private int number;
	private double subtotal;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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
		return price * number;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
}
