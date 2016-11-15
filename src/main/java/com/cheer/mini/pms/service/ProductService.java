package com.cheer.mini.pms.service;

import java.util.List;

import com.cheer.mini.pms.model.Product;

public interface ProductService {
	
		//查找热门商品
	public List<Product> findByHot(int hot);

	public List<Product> findByListHot(int hot);

	public Product findById(String pid);
	
	}
