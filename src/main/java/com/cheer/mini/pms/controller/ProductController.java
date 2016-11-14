package com.cheer.mini.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
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
}
