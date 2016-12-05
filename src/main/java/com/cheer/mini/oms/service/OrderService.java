package com.cheer.mini.oms.service;

import java.util.List;

import com.cheer.mini.oms.model.Order;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;

public interface OrderService {

	public void createOrder(Order order);
	
	public void updateItem(String userId, String orderId, int itemStatus, String pid);
	
	public List<Order> queryByUserId(String userId);
	
	public List<MyShoppingCart> queryByOrderId(String orderId);
	
	public MyShoppingCart query(String userId, String pid);
	
}
