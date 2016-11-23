package com.cheer.mini.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.util.PageBean;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;
@Controller
@RequestMapping("/pms/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//访问首页
	@RequestMapping("/findByHot")
	public ModelAndView findByHot(final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Product> typelist = productService.findByType();
		List<Product> hotlist = productService.findByHotOne();
		List<Product> newlist=productService.findByNew();
		List<Product> list=productService.findByHot(Constants.Hot);
		request.getSession().setAttribute("typelist", typelist);
        request.getSession().setAttribute("hotlist", hotlist);
		ModelAndView mv = new ModelAndView();
		mv.addObject("newlist", newlist);
		mv.addObject("list", list);
		mv.setViewName("/ums/customerIndex");
		return mv;
	}
	
	
			//根据id查询
	@RequestMapping("/findById")
	//根据商品Id查询商品
	public ModelAndView fingById(final HttpServletRequest request,@RequestParam("pid") String pid) throws ServiceException,Exception{
		ResultEntity result = null;
		Product product = productService.findById(pid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("product",product);
		mv.setViewName("/pms/product_detail");
		return mv;
	}
			
		
		//根据分类查询商品
		@RequestMapping("/findByTypeProduct")
	    public ModelAndView findByTypeProduct(final HttpServletRequest request, @RequestParam("type" ) String type) throws ServiceException, Exception {
			ResultEntity result = null;
			
	       List<Product> list = productService.findByTypeProduct(type);
	        System.out.println(list);
	        ModelAndView mv=new ModelAndView();
			mv.addObject("list", list);
			mv.setViewName("/pms/product_center");
	        return mv;
		}
		
		
		//查找所有热门商品并实现分页
		@RequestMapping("/findByListHot")
		public ModelAndView findByListHot(@RequestParam("page") int page) {
			PageBean<Product> pageBean=productService.findByPage(Constants.Hot,page);
			ModelAndView mv = new ModelAndView();
			mv.addObject("pageBean", pageBean);
			mv.setViewName("/pms/hotlist");
			return mv;
		}
		
				//查找所有商品并实现分页
				@RequestMapping("/findByAll")
				public ModelAndView findByAll(@RequestParam("page") int page) {
					PageBean<Product> pageBean=productService.findByPageAll(page);
					ModelAndView mv = new ModelAndView();
					mv.addObject("pageBean", pageBean);
					mv.setViewName("/pms/alllist");
					return mv;
				}
				
				
				//查找商品类型并实现分页
				@RequestMapping("/findByType")
				public ModelAndView findByType(@RequestParam("page") int page,
						@RequestParam("type") String type
						) {
					PageBean<Product> pageBean=productService.findByType(type,page);
					ModelAndView mv = new ModelAndView();
					mv.addObject("pageBean", pageBean);
					mv.addObject("type", type);
					mv.setViewName("/pms/typelist");
					return mv;
				}
}
