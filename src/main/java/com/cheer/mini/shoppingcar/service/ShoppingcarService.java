package com.cheer.mini.shoppingcar.service;

import com.cheer.mini.shoppingcar.model.Shoppingcar;

public interface ShoppingcarService {

	public Shoppingcar getbyorderlist(String orderlistid);
	
	public void addAddCommodity(String id,String pid,int number);
	
	
	
}
