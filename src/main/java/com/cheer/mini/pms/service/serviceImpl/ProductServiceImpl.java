package com.cheer.mini.pms.service.serviceImpl;

import java.util.List;

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

	
	//分页查找热门商品
		@Override
		public PageBean<Product> findByPage(int hot, int page) {
			PageBean<Product> pageBean = new PageBean<Product>();
			// 设置参数:
			pageBean.setPage(page);
			// 设置每页显示记录数:
			int limit = 6;
			pageBean.setLimit(limit);
			// 设置总记录数:
			int totalCount = productDao.findCount(hot);
			pageBean.setTotalCount(totalCount);
			// 设置总页数:
			int totalPage = 0;
			if (totalCount % limit == 0) {
				totalPage = totalCount / limit;
			} else {
				totalPage = totalCount / limit + 1;
			}
			pageBean.setTotalPage(totalPage);
			//从第几条数据开始
			int begin = (page - 1) * limit;
			// 设置页面显示数据的集合:
			List<Product> list = productDao.findByPage(hot ,begin,limit);
			pageBean.setList(list);
			return pageBean;
			}
	

		//分页查询所有商品
		@Override
		public PageBean<Product> findByPageAll(int page) {
			PageBean<Product> pageBean = new PageBean<Product>();
			// 设置参数:
			pageBean.setPage(page);
			// 设置每页显示记录数:
			int limit = 6;
			pageBean.setLimit(limit);
			// 设置总记录数:
			int totalCount = productDao.findCountAll();
			pageBean.setTotalCount(totalCount);
			// 设置总页数:
			int totalPage = 0;
			if (totalCount % limit == 0) {
				totalPage = totalCount / limit;
			} else {
				totalPage = totalCount / limit + 1;
			}
			pageBean.setTotalPage(totalPage);
			//从第几条数据开始
			int begin = (page - 1) * limit;
			// 设置页面显示数据的集合:
			List<Product> list = productDao.findByPageAll(begin,limit);
			pageBean.setList(list);
			return pageBean;
		}
		
		

		//分页按类型查找商品
	@Override
	public PageBean<Product> findByType(String type, int page) {
			PageBean<Product> pageBean = new PageBean<Product>();
			// 设置参数:
			pageBean.setPage(page);
			// 设置每页显示记录数:
			int limit = 6;
			pageBean.setLimit(limit);
			// 设置总记录数:
			int totalCount = productDao.findCountType(type);
			pageBean.setTotalCount(totalCount);
			// 设置总页数:
			int totalPage = 0;
			if (totalCount % limit == 0) {
				totalPage = totalCount / limit;
			} else {
				totalPage = totalCount / limit + 1;
			}
			pageBean.setTotalPage(totalPage);
			//从第几条数据开始
			int begin = (page - 1) * limit;
			// 设置页面显示数据的集合:
			List<Product> list = productDao.findByPageType(type,begin,limit);
			pageBean.setList(list);
			return pageBean;
			}
	
}
