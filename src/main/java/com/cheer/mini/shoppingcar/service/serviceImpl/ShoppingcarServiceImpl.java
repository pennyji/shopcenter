package com.cheer.mini.shoppingcar.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
import com.cheer.mini.shoppingcar.model.Shoppingcar;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;
import com.cheer.mini.ums.model.User;

@Service
public class ShoppingcarServiceImpl implements ShoppingcarService{

	
	private ShoppingcarDao shoppingcardao;
	
	public Shoppingcar getbyorderlist(String orderlistid){
		
		Shoppingcar orderlist = shoppingcardao.getbyorderlist(orderlistid);
		return orderlist;
		
		
	}
	
	
	public void addAddCommodity(String id,String pid,int number){
		
		Shoppingcar orderlist = this.getbyorderlist();
		if(orderlist.getNumber()<=0){throw new ServiceException("数量不能小于0");}
		
		orderlist = new Shoppingcar();
		
		
		
		
		
	}
	
	
	
}
