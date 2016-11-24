package com.cheer.mini.pms.service;


import java.util.List;
import java.util.Map;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.util.PageBean;
import com.cheer.mini.pms.model.Product;

public interface ProductService {
	
		//查找热门商品
	public List<Product> findByHot(int hot);

	
	public Product findLatestProduct();
	
	public List<Product> findAll(Map<String,Integer> params);
	


	public List<Product> findByListHot(int hot);

	public Product findById(String pid);

	

	

	public List<Product> findByNew();
	//查询商品分类显示分类导航栏
	public List<Product> findByType() throws ServiceException;
	//根据商品分类查询商品
	public List<Product> findByTypeProduct(String type) throws ServiceException;
	//根据商品Id查询商品
	public Product findByPid(String pid) throws ServiceException;
	//根据商品Hot查询商品
	public List<Product> findByHotOne() throws ServiceException ;

	public PageBean<Product> findByPage(int hot, int page);
	//查找所有商品
	public PageBean<Product> findByPageAll(int page);
	//查找商品类型并实现分页
	public PageBean<Product> findByType(String type, int page);


	
}
