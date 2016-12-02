package com.cheer.mini.oms.model;

import java.util.Date;
import java.util.List;

import com.cheer.mini.base.util.StringUtil;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;

public class Order {

	private String orderId = StringUtil.createUUID();
	private String userId;
	private String name;
	private String address;
	private String phone;
	private Date orderDate = new Date();
	private int orderStatus;
	private double totalSum;
	
	private List<MyShoppingCart> myShoppingCarts;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}

	public List<MyShoppingCart> getMyShoppingCarts() {
		return myShoppingCarts;
	}

	public void setMyShoppingCarts(List<MyShoppingCart> myShoppingCarts) {
		this.myShoppingCarts = myShoppingCarts;
	}

}
