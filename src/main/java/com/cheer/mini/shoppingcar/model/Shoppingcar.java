package com.cheer.mini.shoppingcar.model;

import java.util.Date;

import com.cheer.mini.base.util.StringUtil;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.ums.model.User;

public class Shoppingcar {

	private String orderlistid = StringUtil.createUUID();
	
	private int number;
	
	private String pid ;
	
    private String id ;
    
    private int itemstatus;
    
    private String orderid = null;
    
    private Date addtime;

	public String getOrderlistid() {
		return orderlistid;
	}

	public void setOrderlistid(String orderlistid) {
		this.orderlistid = orderlistid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getItemstatus() {
		return itemstatus;
	}

	public void setItemstatus(int itemstatus) {
		this.itemstatus = itemstatus;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
    
    
	
}
