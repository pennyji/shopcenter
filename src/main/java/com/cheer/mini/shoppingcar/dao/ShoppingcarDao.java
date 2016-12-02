package com.cheer.mini.shoppingcar.dao;

import java.util.List;



import com.cheer.mini.pms.model.Product;
import com.cheer.mini.shoppingcar.model.Cart;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.model.Shoppingcar;

public interface ShoppingcarDao {

	public void saveAddCommodity(Shoppingcar shoppingcar);
	
	public void delectAddCommodity(Product product);

	public List<Cart> getCartMsg (String userid);
	
	/**
	 * 根据用户 id 连接查询获取商品对象集合
	 * @param id
	 * @return
	 */
	public List<MyShoppingCart> query1(String id);
	
	/**
	 * 根据用户 id 和商品 pid 获取商品对象集合
	 * @param id
	 * @param pid
	 * @return
	 */
	public List<MyShoppingCart> query2(String id, String pid, int itemStatus);
	
	/**
	 * 修改购物车中商品数量价格 
	 */
	public void update(int number, String id, String pid);
	
	/**
	 * 移除商品项
	 * @param pid
	 */
	public void delete(String pid);
	
}
