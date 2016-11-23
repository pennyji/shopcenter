package com.cheer.mini.ums.model;

import com.cheer.mini.base.model.BaseEntity;

public class Cart extends BaseEntity{
  private String userid;
  private String orderlistid;
  private String pid;
  private int number;
  private double price;
  
  

public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}

public String getOrderlistid() {
	return orderlistid;
}
public void setOrderlistid(String orderlistid) {
	this.orderlistid = orderlistid;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
