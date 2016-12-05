package com.cheer.mini.shoppingcar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.pms.service.ProductService;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;
import com.cheer.mini.ums.model.User;

@Controller
@RequestMapping("/ums/Shoppingcar")
public class ShoppingcarController {

	@Autowired
	private ShoppingcarService shoppingcarService;
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 添加商品到购物车
	 * @param pid
	 * @param request
	 * @return
	 */
	@RequestMapping("/addToCart")
	public ModelAndView addToCart(@RequestParam(value = "pid") String pid,
			HttpServletRequest request) {
		
		System.out.println("addToCart()...");
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		int quantity = Integer.parseInt(request.getParameter("count"));
		System.out.println(quantity);
		ModelAndView modelAndView = new ModelAndView();
		if (user == null) {
			modelAndView.setViewName("/ums/login");
		}else {
			List<MyShoppingCart> myShoppingCarts = shoppingcarService.queryProduct2(user.getId(), pid, Constants.ItemStatus.ITEM_STATUS_NO);
			if (myShoppingCarts.size() == 0) {
				shoppingcarService.addAddCommodity(user.getId(), pid, quantity);
			}else {
				for (int i = 0; i < myShoppingCarts.size(); i++) {
					shoppingcarService.updateProduct(myShoppingCarts.get(i).getNumber() 
							+ quantity, user.getId(), pid);
				}
			}
			modelAndView.setViewName("/ums/addsuccess");
		}
		return modelAndView;
		
	}

	/**
	 * 显示购物车中的商品
	 * @param request
	 * @return
	 */
	@RequestMapping("/showShoppingCart")
	public ModelAndView showShoppingCart(HttpServletRequest request) {
		System.out.println("showShoppingCart()...");
		ModelAndView modelAndView = new ModelAndView();
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		List<MyShoppingCart> list = new ArrayList<MyShoppingCart>();
		if(user == null){
			modelAndView.setViewName("/ums/emptycart");
		}else{
			String id = user.getId();
			list = shoppingcarService.queryProduct1(id);
			
			if (list.size() == 0) {
				modelAndView.setViewName("/ums/emptycart");
			}else {
				Map<String,Object> cart = shoppingcarService.getCartMsg(id);
				request.getSession().setAttribute("totalMoney", cart.get("totalCount"));
				
				modelAndView.setViewName("/ums/shoppingcar");
			}
		}
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
	/**
	 * 移除购物车中商品项
	 * @param pid
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteItem")
	public ModelAndView deleteItem(@RequestParam("pid") String pid, HttpServletRequest request){
		System.out.println("deleteItem()...");
		shoppingcarService.deleteItem(pid);
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		List<MyShoppingCart> list = shoppingcarService.queryProduct1(user.getId());
		ModelAndView modelAndView = new ModelAndView();
		if (list.size() == 0) {
			modelAndView.setViewName("/ums/emptycart");
		}else{
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/ums/shoppingcar");
		}
		return modelAndView;
	}
	
	@RequestMapping("/updateItem")
	public ResponseEntity<ResultEntity> updateItems(HttpServletRequest request,@RequestParam String pid,@RequestParam String uid,@RequestParam String number){
		int num = Integer.parseInt(number);
		shoppingcarService.updateProduct(num, uid, pid);
//		List<MyShoppingCart> list = shoppingcarService.queryProduct1(uid);
		ResultEntity result = null;
		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,"更新成功");
		return new ResponseEntity<ResultEntity>(result,HttpStatus.CREATED);
		
	}

}
