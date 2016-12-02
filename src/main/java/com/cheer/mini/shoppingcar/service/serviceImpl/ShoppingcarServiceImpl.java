package com.cheer.mini.shoppingcar.service.serviceImpl;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
import com.cheer.mini.shoppingcar.model.Cart;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.model.Shoppingcar;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;

@Service
public class ShoppingcarServiceImpl implements ShoppingcarService{

	@Autowired
	private ShoppingcarDao shoppingcardao;

	@Override
	public void addAddCommodity(String id,String pid,int number) {
		Shoppingcar shoppingcar = new Shoppingcar();
		shoppingcar.setPid(pid);
		shoppingcar.setId(id);
		shoppingcar.setNumber(number);
		shoppingcar.setAddtime(new Date());
		
		shoppingcardao.saveAddCommodity(shoppingcar);

	}

	@Override
	public Shoppingcar getbyorderlist(String orderlistid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String,Object> getCartMsg(String userid) {
		int totalNum=0;
		double totalCount = 0 ;
		Map<String,Object> cartMap = new HashMap<String,Object>();
		List<Cart> cart=shoppingcardao.getCartMsg(userid);
		for(Cart list:cart){
			totalNum = totalNum + list.getNumber();
			totalCount = totalCount + list.getNumber()*list.getPrice();
		}
		cartMap.put("totalNumber", totalNum);
		cartMap.put("totalCount", totalCount);
		return cartMap;
	}

	@Override
	public List<MyShoppingCart> queryProduct1(String id) {
		List<MyShoppingCart> myShoppingCarts = shoppingcardao.query1(id);
		return myShoppingCarts;
	}

	@Override
	public List<MyShoppingCart> queryProduct2(String id, String pid, int itemstatus) {
		List<MyShoppingCart> myShoppingCarts = shoppingcardao.query2(id, pid, itemstatus);
		return myShoppingCarts;
	}
	
	@Override
	public void updateProduct(int number, String id, String pid) {
		shoppingcardao.update(number, id, pid);
	}
	
	@Override
	public void deleteItem(String pid) {
		shoppingcardao.delete(pid);
	}

}
