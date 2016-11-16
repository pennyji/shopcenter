package com.cheer.mini.pms.service;

import java.util.List;
import java.util.Map;

import com.cheer.mini.pms.model.Product;

public interface ProductService {
	
		//查找热门商品
	public List<Product> findByHot(int hot);
	
	public Product findLatestProduct();
	
	public List<Product> findAll(Map<String,Integer> params);
	
	public Product findById(String productId);
	
}
