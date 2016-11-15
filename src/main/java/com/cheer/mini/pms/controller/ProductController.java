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
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;
@Controller
@RequestMapping("/pms/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//访问首页显示最热门商品（只取出三条）
	@RequestMapping("/findByHot")
	public ModelAndView findByHot(final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Product> list=productService.findByHot(Constants.Hot);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/ums/customerIndex");
		return mv;
	}
	
	//查找所有热门商品并实现分页
	@RequestMapping("/findByListHot")
	public ModelAndView findByListHot(final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Product> list=productService.findByListHot(Constants.Hot);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/pms/product_detail");
		return mv;
	}
	
	
			//根据id查找跳转到购物车
		@RequestMapping("/findById")
		public ModelAndView findById(@RequestParam("pid")String pid) {
			Product product=productService.findById(pid);
			ModelAndView mv = new ModelAndView();
			mv.addObject("product", product);
			mv.setViewName("/pms/product_detail");
			return mv;
		}
}
