package com.cheer.mini.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.pms.model.Commodity;
import com.cheer.mini.pms.service.CommodityService;
import com.cheer.mini.ums.dto.request.LoginRequest;
import com.cheer.mini.ums.model.User;


@Controller
@RequestMapping("/pms")
public class CommodityController {
	
	 @Autowired
	private CommodityService commdityService;
	
	 @RequestMapping("/commdity")
	    public ModelAndView commdity(final HttpServletRequest request, final HttpServletResponse response) {
	     
		 ModelAndView mv = new ModelAndView("left");
	        return mv;
	 }
	 
	 @RequestMapping(value = "/findById")
	  public ModelAndView findById(final HttpServletRequest request, @RequestParam("commodityId") String commodityId) throws ServiceException, Exception {
	        ResultEntity result = null;
	        Commodity commodity = commdityService.findById(commodityId);
	        System.out.println(commodity);
	        ModelAndView mv = new ModelAndView();
	        mv.addObject("commodity", commodity);   
	        mv.setViewName("pms/commdity_main");
	        
	       return mv;
	    }

}
