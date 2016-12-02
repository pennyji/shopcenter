package com.cheer.mini.oms.controller;

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
import org.springframework.web.util.UriComponentsBuilder;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.oms.model.Order;
import com.cheer.mini.oms.service.OrderService;
import com.cheer.mini.pms.model.Product;
import com.cheer.mini.pms.service.ProductService;
import com.cheer.mini.shoppingcar.model.MyShoppingCart;
import com.cheer.mini.shoppingcar.service.ShoppingcarService;
import com.cheer.mini.ums.model.User;

@Controller
@RequestMapping("/oms/order")
public class OrderController {

	@Autowired
	private ShoppingcarService shoppingcarService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 显示订单页面
	 * @param request
	 * @return
	 */
//	@RequestMapping("/showOrderPage")
//	public ModelAndView showOrderPage(HttpServletRequest request){
//		System.out.println("showOrderPage()...");
//		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
//		List<MyShoppingCart> myShoppingCarts = shoppingcarService.queryProduct1(user.getId());
//		ModelAndView modelAndView = new ModelAndView();
//		if (myShoppingCarts.size() == 0) {
//			modelAndView.setViewName("/ums/emptycart");
//		}else {
//			Map<String,Object> cart = shoppingcarService.getCartMsg(user.getId());
//			request.getSession().setAttribute("totalMoney", cart.get("totalCount"));
//			modelAndView.addObject("myShoppingCarts", myShoppingCarts);
//			modelAndView.setViewName("/oms/order");
//		}
//		
//		return modelAndView;
//	}
	
	@RequestMapping("/showOrderPage")
	public ResponseEntity<ResultEntity> showOrderPage(@RequestParam("pids") String pid,
			HttpServletRequest request,UriComponentsBuilder builder){
		ResultEntity result = null;
		System.out.println("showOrderPage()...");
		String[] pids = pid.split(";");
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		List<MyShoppingCart> list = new ArrayList<MyShoppingCart>();
		for (int i = 0; i < pids.length-1; i++) {
			String id= pids[i+1];
			MyShoppingCart myShoppingCart = orderService.query(user.getId(), id);
			list.add(myShoppingCart);
		}
		request.getSession().setAttribute("listcat", list);
		
		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,"",list);
			
		return new ResponseEntity<ResultEntity>(result,HttpStatus.CREATED);
			
	}
	
	@RequestMapping("/showOrder")
	public ModelAndView showOrder(HttpServletRequest request){
		List<MyShoppingCart> list = (List<MyShoppingCart>) request.getSession().getAttribute("listcat");
		double sutotal=0;
		for (int i = 0; i < list.size(); i++) {
			 sutotal+= list.get(i).getNumber()*list.get(i).getPrice();
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("sutotal", sutotal);
		mv.setViewName("/oms/order");
		return mv;
	}
		
	
	/**
	 * 生成订单
	 * @return
	 */
	@RequestMapping("/toGenerateOrder")
	public ModelAndView toGenerateOrder(HttpServletRequest request){
		System.out.println("toGenerateOrder()...");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		double sum = Double.valueOf(request.getParameter("sum")).doubleValue();
		Order order = new Order();
		order.setName(name);
		order.setAddress(address);
		order.setPhone(phone);
		order.setTotalSum(sum);
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		order.setUserId(user.getId());
		orderService.createOrder(order);
		orderService.updateItem(user.getId(), order.getOrderId(), Constants.ItemStatus.ITEM_STATUS_YES);
		
		ModelAndView modelAndView = new ModelAndView("/oms/ordersuccess");
		return modelAndView;
	}
	
	/**
	 * 查看订单
	 * @param request
	 * @return
	 */
	@RequestMapping("/showOrderDetail")
	public ModelAndView showOrderDetail(HttpServletRequest request){
		System.out.println("showOrderDetail()...");
		User user = (User) request.getSession().getAttribute(Constants.CURRENT_USER);
		ModelAndView modelAndView = new ModelAndView();
		if (user == null) {
			modelAndView.setViewName("/oms/orderdetail");
		}else {
			List<Order> orders = orderService.queryByUserId(user.getId());
			for (int i = 0; i < orders.size(); i++) {
				List<MyShoppingCart> myShoppingCarts = orderService.queryByOrderId(orders.get(i).getOrderId());
				orders.get(i).setMyShoppingCarts(myShoppingCarts);
			}
			modelAndView.addObject("orders", orders);
			modelAndView.setViewName("/oms/orderdetail");
		}
		return modelAndView;
	}
	
}
