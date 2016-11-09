package com.cheer.mini.pms.model;

import com.cheer.mini.category.model.Category;

public class Commodity {
	private String commodityId;
	private String commodityName;
	
	private String commodityDetail;
	private String commodityImage;
	private Category category;
	private double commodityprice;//定价
	private double commoditycurrPrice;//当前价
	private double commoditydiscount;//折扣
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getCommodityImage() {
		return commodityImage;
	}
	public void setCommodityImage(String commodityImage) {
		this.commodityImage = commodityImage;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	
	
	
	public double getCommodityprice() {
		return commodityprice;
	}
	public void setCommodityprice(double commodityprice) {
		this.commodityprice = commodityprice;
	}
	public double getCommoditycurrPrice() {
		return commoditycurrPrice;
	}
	public void setCommoditycurrPrice(double commoditycurrPrice) {
		this.commoditycurrPrice = commoditycurrPrice;
	}
	public double getCommoditydiscount() {
		return commoditydiscount;
	}
	public void setCommoditydiscount(double commoditydiscount) {
		this.commoditydiscount = commoditydiscount;
	}
	public String getCommodityDetail() {
		return commodityDetail;
	}
	public void setCommodityDetail(String commodityDetail) {
		this.commodityDetail = commodityDetail;
	}
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
