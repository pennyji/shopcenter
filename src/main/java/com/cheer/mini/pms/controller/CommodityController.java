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
	
	
}
