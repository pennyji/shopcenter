package com.cheer.mini.shoppingcar.service;

import com.cheer.mini.shoppingcar.model.Shoppingcar;


public interface ShoppingcarService {


	public Shoppingcar getbyorderlist(String orderlistid);//接口——通过orderlistid获得购物车
	
	public void addAddCommodity(String id,String pid,int number);//接口——通过用户id,商品pid,商品number添加到购物车

}
