package com.cheer.mini.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.base.Constants;
import com.cheer.mini.pms.model.Commodity;
import com.cheer.mini.pms.service.CommodityService;



/*商品的controller，我需要将页面的值传进来。2016年10月26日12:52:54
 * 
 * 
 * */
//@SessionAttributes("list")
@Controller
@RequestMapping("/pms/commodity")
//定义好我的路径,记住这里要到拦截器里面去一趟，解除拦截
public class CommodityController {
	
	//自动装配底层的类
	@Autowired
	private CommodityService commodityService;

	/*/
	 * 
	 * 
	 * /显示所有商品，登录后直接调用者个方法显示所有商品
	*/
	@RequestMapping("/all")
	public ModelAndView getcommodityAll(){
		System.out.println("wolaile ");
		List<Commodity> list=commodityService.getcommodityAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("pms/commodity");
        return mv;
	}
	
	
	/*使用模糊查询的方法，我使用的是@RequestParam("commodityDetail") String name
	这个方法取值的
	
	*/
	@RequestMapping("/detail")
	public ModelAndView getcommodityDetail(final HttpServletRequest request,@RequestParam("commodityDetail") String name ){
		List<Commodity> list=commodityService.getcommodityDetail(name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("pms/commodity");
        return mv;
	}
	
	/*我不能在使用以前的那个JSP页面了，得新建一个才行
	 * 下面是一个点击了图片进入超链接的方法，进去以后根据id显示详情
	 * 同时id唯一
	 * 
	 * */
	@RequestMapping("/commodityId")
	public ModelAndView getCommodityId(final HttpServletRequest request,@RequestParam("commodityId") String commodityId){
		ModelAndView mv=new ModelAndView();
		Commodity commodity=commodityService.getcommodityId(commodityId);
		mv.addObject("commodity", commodity);
		mv.setViewName("pms/commodity_detail");
		return mv;
	}
	
	/*
	 * 处理价格区间的一个方法，返回一个list
	 * 页面还需要该进
	 * */
	@RequestMapping("/price")
	public ModelAndView getcommodityPrice(@RequestParam("price1") double price1,@RequestParam("price2") double price2){
		 
			List<Commodity> list=commodityService.getcommodityPrice(price1, price2);
			ModelAndView mv = new ModelAndView();
			mv.addObject("list",list);
			mv.setViewName("pms/commodity");
			return mv;
	}
	
	/*
	 * 下拉框分类用的方法，使用的是js提交的方法
	 * 
	 * */
	@RequestMapping("/category")
	public ModelAndView getcommodityCategory(@RequestParam("commodityCategory") String commodityCategory){
		List<Commodity> list=commodityService.getcommodityType(commodityCategory);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("pms/commodity");
        return mv;
	}
	
	/*
	 * 
	 * 跳转到登录页面的方法
	 * 
	 * */
	@RequestMapping("/gotologin")
    public ModelAndView logout(final HttpServletRequest request, final HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("ums/login");
        return mv;
    }
	
	/*
	 * 
	 * 跳转到登录页面的方法
	 * 
	 * */
	@RequestMapping("/gotoregister")
    public ModelAndView register(final HttpServletRequest request, final HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("ums/register");
        return mv;
    }

}
