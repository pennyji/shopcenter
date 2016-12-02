package com.cheer.mini.shoppingcar.service;

import java.util.List;
import java.util.Map;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.model.Shoppingcar;

public interface ShoppingcarService {

	public Shoppingcar getbyorderlist(String orderlistid);
	
	public void addAddCommodity(String id,String pid,int number);
	
	public Map<String,Object> getCartMsg (String userid);
	
	public List<MyShoppingCart> queryProduct1(String id);

	public List<MyShoppingCart> queryProduct2(String id,String pid,int itemstatus);
	
	public void updateProduct(int number, String id, String pid);
	
	public void deleteItem(String pid);

}
