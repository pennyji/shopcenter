package com.cheer.mini.pms.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.pms.dao.ProductDao;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> findByHot(int hot) {
		List<Product> list=productDao.findByHot(hot);
		return list;
	}


		
}
