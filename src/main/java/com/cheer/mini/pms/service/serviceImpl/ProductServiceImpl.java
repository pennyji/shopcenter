package com.cheer.mini.pms.service.serviceImpl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.util.PageBean;
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

	@Override
	public Product findLatestProduct() {
		Product product = productDao.findLatestProduct();
		if(product == null){
			throw new ServiceException("查找发生异常");
		}
		
		return product;
	}

	@Override
	public List<Product> findAll(Map<String,Integer> params) {
		List<Product> products = productDao.findAll(params);
		if(products.size()==0){
			throw new ServiceException("没有任何商品在售");
		}
		return products;
	}


	
	//显示所有最热门商品
	@Override
	public List<Product> findByListHot(int hot) {
		List<Product> list=productDao.findByListHot(hot);
		return list;
	}


	@Override
	public Product findById(String pid) {
		Product product=productDao.findById(pid);
		return product;
	}


	@Override
	//查询商品分类显示分类导航栏
	public List<Product> findByType() {
		List<Product> list = productDao.findByType();
		return list;
	}
	
	
	@Override
	//根据商品分类查询商品
	public List<Product> findByTypeProduct(String type) {
		List<Product> list = productDao.findByTypeProduct(type);
		return list;
	}
	


	@Override
	//根据商品hot查询商品
	public List<Product> findByHotOne(){
		return productDao.findByHotOne();
	}


	@Override
	public List<Product> findByNew() {
		return productDao.findByNew();
	}


	@Override
	public Product findByPid(String pid) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Product> findByPage(int hot, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Product> findByPageAll(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Product> findByType(String type, int page) {
		// TODO Auto-generated method stub
		return null;
	}

}
