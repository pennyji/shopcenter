package com.cheer.mini.oms.dao;

import java.util.List;

import com.cheer.mini.oms.model.Order;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;

public interface OrderDao {

	public void insert(Order order);
	
	public void update(String userId, String orderId, int itemStatus, String pid);
	
	public List<Order> queryByUserId(String userId);
	
	public List<MyShoppingCart> queryByOrderId(String orderId);
	
	public MyShoppingCart query(String userId, String pid);
	
}
