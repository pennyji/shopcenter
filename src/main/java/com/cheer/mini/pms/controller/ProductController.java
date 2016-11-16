package com.cheer.mini.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;
@Controller
@RequestMapping("/pms/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/findByHot")
	public ModelAndView findByHot(final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Product> list=productService.findByHot(Constants.Hot);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/ums/customerIndex");
		return mv;
	}
	
	//根据id找出商品
	@RequestMapping("/findById")
	public ModelAndView findLatestProduct(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String id = request.getParameter("productId");
		Product product = productService.findById(id);
		mv.addObject("product", product);
		mv.setViewName("pms/commodity_detail");
		
		return mv;
	}
}
