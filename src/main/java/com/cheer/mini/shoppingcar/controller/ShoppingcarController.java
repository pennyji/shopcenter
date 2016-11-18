package com.cheer.mini.shoppingcar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
import com.cheer.mini.shoppingcar.dto.request.AddOrderlistRequest;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;

@Controller
@RequestMapping("/ums/Shoppingcar")
public class ShoppingcarController {
	
//	private ShoppingcarDao shoppingcardao;
	@Autowired
	private ShoppingcarService shoppingcarService;
	
	@RequestMapping(value = "/addToCart")
	public ModelAndView addToCart(HttpServletRequest request)
	{
		AddOrderlistRequest  addOrderlistrequest =new AddOrderlistRequest();
		String pid = request.getParameter("pid");//从前端页面上获取商品的pid放到“pid”中
		String id = request.getParameter("id");//从前端页面上获取用户id放到“id”中
		shoppingcarService.addAddCommodity(id, pid, 1);//调用shoppingcarService中的addAddCommodity方法将
		ModelAndView mv =new ModelAndView();
		mv.addObject("addOrderlistrequest",addOrderlistrequest);
		mv.setViewName("/ums/shoppingcar");
		
		return mv;
	}

}
