package com.cheer.mini.shoppingcar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
import com.cheer.mini.shoppingcar.dao.ShoppingcarDao;
import com.cheer.mini.shoppingcar.dto.request.AddOrderlistRequest;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;
import com.cheer.mini.ums.model.User;

@Controller
@RequestMapping("/ums/Shoppingcar")
public class ShoppingcarController {

	
//	private ShoppingcarDao shoppingcardao;
	@Autowired
	private ShoppingcarService shoppingcarService;
	
	/*@RequestMapping(value = "/addToCart")
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
	}*/
		
	/**
	 * 添加商品到购物车
	 * @param pid
	 * @param request
	 * @return
	 */
	@RequestMapping("/addToCart")
	public ModelAndView addToCart(@RequestParam(value = "pid") String pid,
			HttpServletRequest request) {
		
		System.out.println("addToCart()");
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		int quantity = Integer.parseInt(request.getParameter("count"));
		System.out.println(quantity);
		ModelAndView modelAndView = new ModelAndView();
		if (user == null) {
			modelAndView.setViewName("/ums/login");
		}else {
			
			shoppingcarService.addAddCommodity(user.getId(), pid, quantity);
			modelAndView.setViewName("/ums/addsuccess");
		}
		return modelAndView;
		
	}


	

	@Autowired
	private ShoppingcarDao shoppingcarDao;

	@RequestMapping("/showShoppingCart")
	public ModelAndView showShoppingCart(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println(id);
		List<MyShoppingCart> list = shoppingcarDao.queryByUserId(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/ums/shoppingcar");
		return modelAndView;

	}

}
