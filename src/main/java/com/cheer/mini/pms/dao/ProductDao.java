package com.cheer.mini.pms.dao;

import java.util.List;
import java.util.Map;

import com.cheer.mini.pms.model.Product;


public interface ProductDao {
	/*//查找商品类型
	public Product findByType(String account);*/ 
	//查找热门商品
	public List<Product> findByHot(int hot);
	/*//查找最新商品
	public List<Product> findByNew();*/
	//模糊查询商品
	public List<Product> findByProduct();
	/*//增加商品
	public Product addProduct(Product product);*/
	
	public Product findLatestProduct();
	
	public List<Product> findAll(Map<String,Integer> params);
	
	public Product findById(String productId);
	
	
}
