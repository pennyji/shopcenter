package com.cheer.mini.pms.dao;

import java.util.List;

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
	//查询所有热门商品
	public List<Product> findByListHot(int hot);
	//根据id查询单个 的商品
	public Product findById(String pid);
	
	
}
