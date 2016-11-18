package com.cheer.mini.shoppingcar.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
import com.cheer.mini.shoppingcar.model.Shoppingcar;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;

@Service
public class ShoppingcarServiceImpl implements ShoppingcarService{

	@Autowired
	private ShoppingcarDao shoppingcardao;
	
	public Shoppingcar getbyorderlist(String orderlistid){
		
		Shoppingcar orderlist = shoppingcardao.getbyorderlist(orderlistid);
		return orderlist;
		
		
	}
	
	
	public void addAddCommodity(String id,String pid,int number){
		
		Shoppingcar sc = new Shoppingcar();
		sc.setId(id);//调用Shoppingcar中的属性id
		sc.setPid(pid);//调用Shoppingcar中的属性pid
		sc.setNumber(number);//调用Shoppingcar中的属性number
		shoppingcardao.saveAddCommodity(sc);//调用shoppingcardao中的saveAddCommodity接口通过shoppingcar.sql.xml语句将数据保存到数据库
	
	}
	
	
	
}
