package com.cheer.mini.shoppingcar.dao;

import java.util.List;



import com.cheer.mini.pms.model.Product;
import com.cheer.mini.shoppingcar.model.Cart;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.model.Shoppingcar;

public interface ShoppingcarDao {

	public String findbyPid(String orderlistId);
	
	public Product findbyPms(String pid);
	
	public void saveAddCommodity(Shoppingcar shoppingcar);
	
	public void updateAddCommodity(Product product);
	
	public void delectAddCommodity(Product product);

	/**
	 * 根据用户 id 获取商品对象集合
	 * @param id
	 * @return
	 */
	public List<MyShoppingCart> queryByUserId(String id);
	
	public  List<Cart> getCartMsg (String userid);
	
}
