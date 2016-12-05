package com.cheer.mini.oms.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.oms.dao.OrderDao;
import com.cheer.mini.oms.model.Order;
import com.cheer.mini.oms.service.OrderService;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void createOrder(Order order) {
		orderDao.insert(order);
	}

	@Override
	public void updateItem(String userId, String orderId, int itemStatus, String pid) {
		orderDao.update(userId, orderId, itemStatus, pid);
	}

	@Override
	public List<Order> queryByUserId(String userId) {
		List<Order> orders = orderDao.queryByUserId(userId);
		return orders;
	}
	
	@Override
	public List<MyShoppingCart> queryByOrderId(String orderId) {
		List<MyShoppingCart> myShoppingCarts = orderDao.queryByOrderId(orderId);
		return myShoppingCarts;
	}

	@Override
	public MyShoppingCart query(String userId, String pid) {
		MyShoppingCart myShoppingCart = orderDao.query(userId, pid);
		return myShoppingCart;
	}

}
