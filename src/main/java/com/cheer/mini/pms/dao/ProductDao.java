package com.cheer.mini.pms.dao;

import java.util.List;

import com.cheer.mini.pms.model.Product;


public interface ProductDao {

	public Product getProductId(String account); 
	
	public List<Product> showAllProduct();
	
	public Product addProduct(Product product);
	
}
