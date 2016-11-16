package com.cheer.mini.pms.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.mini.base.exception.ServiceException;
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

	@Override
	public Product findById(String productId) {
		
		return productDao.findById(productId);
	}


		
}
