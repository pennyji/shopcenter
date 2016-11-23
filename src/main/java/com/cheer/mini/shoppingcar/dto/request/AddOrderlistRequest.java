package com.cheer.mini.shoppingcar.dto.request;

public class AddOrderlistRequest {

	private String pid;
	
	private String id;
	
	private int number;

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "AddOrderlistRequest [pid=" + pid + ", id=" + id + ", number="
				+ number + "]";
	}

}
