package com.cheer.mini.ums.controller;



import java.util.HashMap;
import java.util.List;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;
import com.cheer.mini.shoppingcar.model.Cart;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;
import com.cheer.mini.ums.dto.request.LoginRequest;
import com.cheer.mini.ums.model.User;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("/ums/user")
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	private ShoppingcarService shoppingcarService;

	
	@RequestMapping("/login")
	public String toShowIndex(){
		return "redirect:/pms/product/findByHot";
	}
	
	
	@RequestMapping("/showLogin")
	public ModelAndView login(final HttpServletRequest request,
			final HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ums/login");
		return mv;
	}
	
	

	@RequestMapping(value = "/validatelogin")
	public ResponseEntity<ResultEntity> validateLogin(final HttpServletRequest request,final HttpServletResponse response,@RequestBody LoginRequest loginRequest, UriComponentsBuilder builder)
			throws ServiceException, Exception {
		ResultEntity result = null;
		User user = userService.adminLogin(loginRequest.getAccount(),loginRequest.getPassword());
		request.getSession().setAttribute(Constants.CURRENT_USER, user);	
		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,"登录成功", user);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/ums/user/validatelogin")
				.buildAndExpand().toUri());
		return new ResponseEntity<ResultEntity>(result, headers,HttpStatus.CREATED);
	}

	@RequestMapping("/logout")
	public ModelAndView logout(final HttpServletRequest request,final HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ums/login");
		request.getSession().removeAttribute(Constants.CURRENT_USER);
		return mv;
	}

	@RequestMapping("/customerIndex")
	public ModelAndView customerIndex(final HttpServletRequest request,
			final HttpServletResponse response) {
		System.out.println("customerIndex()...");
		ModelAndView mv = new ModelAndView("ums/customerIndex");
		return mv;
	}
	
	@RequestMapping("/adminIndex")
	public ModelAndView adminIndex(final HttpServletRequest request,
			final HttpServletResponse response) {
		System.out.println("adminIndex()...");
		ModelAndView mv = new ModelAndView("ums/adminIndex");
		return mv;
	}


	@RequestMapping("/showIndex")
	public ModelAndView showIndex(final HttpServletRequest request,final HttpServletResponse response){
		Map<String,Integer> params = new HashMap<String,Integer>();
		params.put("startRow", 0);
		params.put("endRow", 5);
		Product product = productService.findLatestProduct();
		List<Product> products = productService.findAll(params);
		List<Product> list=productService.findByHot(Constants.Hot);
		List<Product> typelist = productService.findByType();
		List<Product> hotlist = productService.findByHotOne();
		List<Product> newlist = productService.findByNew();
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		if(user != null){
			Map<String,Object> cart=shoppingcarService.getCartMsg(user.getId());
			request.getSession().setAttribute("totalNum", cart.get("totalNumber"));
			request.getSession().setAttribute("totalCount", cart.get("totalCount"));
		}
		
		request.getSession().setAttribute("typelist", typelist);
		request.getSession().setAttribute("hotlist", hotlist);
		request.getSession().setAttribute(Constants.LATEST_PRODUCT, product);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.addObject(Constants.PRODUCTS, products);
		mv.addObject("newlist", newlist);
		mv.setViewName("/ums/customerIndex");
		
		return mv;
		
	}

}
