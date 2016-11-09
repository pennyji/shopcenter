package com.cheer.mini.pms.dto.request;

public class CommodityRequest {
	private String commodityId;
	//商品名称
	private String commodityName;
	//商品价格
	private Double commodityPrice;
	//商品详情
	private String commodityDetail;
	//商品类型
	private String commodityType;
	
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
	public Double getCommodityPrice() {
		return commodityPrice;
	}
	public void setCommodityPrice(Double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	public String getCommodityDetail() {
		return commodityDetail;
	}
	public void setCommodityDetail(String commodityDetail) {
		this.commodityDetail = commodityDetail;
	}
	public String getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}
	
	
}
