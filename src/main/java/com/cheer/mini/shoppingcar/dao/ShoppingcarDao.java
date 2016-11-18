package com.cheer.mini.shoppingcar.dao;

import com.cheer.mini.pms.model.Product;
import com.cheer.mini.shoppingcar.model.Shoppingcar;

public interface ShoppingcarDao {


	public String findbyPid(String orderlistId);
	
	public Product findbyPms(String pid);
	
	public void saveAddCommodity(Shoppingcar shoppingcar);
	
	public void updateAddCommodity(Product product);
	
	public void delectAddCommodity(Product product);

	public Shoppingcar getbyorderlist(String orderlistid);
	
	
}
