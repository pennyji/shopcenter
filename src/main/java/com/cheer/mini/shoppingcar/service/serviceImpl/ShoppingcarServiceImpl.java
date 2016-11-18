package com.cheer.mini.shoppingcar.service.serviceImpl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
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

}
