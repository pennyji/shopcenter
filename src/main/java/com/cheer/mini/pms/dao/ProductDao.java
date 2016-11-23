package com.cheer.mini.pms.dao;

import java.util.List;

import com.cheer.mini.base.exception.ServiceException;
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
	//查询商品分类显示分类导航栏
	public List<Product> findByType() throws ServiceException;
	//根据商品分类查询商品
	public List<Product> findByTypeProduct(String type) throws ServiceException;
	//根据商品Id查询商品
	public List<Product> findByPid(String pid) throws ServiceException ;
	//根据商品Hot查询商品
	public List<Product> findByHotOne() throws ServiceException ;
	//最新商品6条
	public List<Product> findByNew();
	//分页按照热门
	public int findCount(int hot);
	public List<Product> findByPage(int hot, int begin, int limit);
	//分页，查找所有
	public int findCountAll();
	public List<Product> findByPageAll(int begin, int limit);
	//查找商品类型并实现分页
	public int findCountType(String type);
	public List<Product> findByPageType(String type, int begin, int limit);
	
}
