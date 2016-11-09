package com.cheer.mini.pms.service;

import java.util.List;

import com.cheer.mini.pms.model.Commodity;





/**
 * 站在使用者的角度去设计接口
 * 
 * @author Lucy
 * 这是商品查询的一个接口这些方法起的作用分别是,所以我在JSP页面的查询窗口应该要有一个下拉菜单
 * 注意点，我现在还有两点没做，①新建mapper.xml ②把JSP页面的值传入这个接口 。2016年10月26日12:48:14
 */
public interface CommodityService {
		//点击添加到购物车的时候使用的方法,根据id唯一来添加
    public Commodity getcommodityId(String commodityid);
    	//按照商品名称查询的一个方法
    public Commodity getcommodityName(String commodityname);
    	//定义商品的价格区间的方法
    public List<Commodity> getcommodityPrice(double price1,double price2);
    	//模糊查询商品时使用商品详情查询，默认设置为模糊查询。
    public List<Commodity> getcommodityDetail(String commoditydetail);
    	//指定商品类型时使用的方法。
    public List<Commodity> getcommodityType(String commoditytype);
    	//查询商品表中所有的信息
    public List<Commodity> getcommodityAll();
    
    
}
