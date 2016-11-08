package com.cheer.mini.ums.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.ums.dto.request.LoginRequest;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("ums/validate")
public class ValidateAjaxController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("validateAjax")
	public ModelAndView validateAjax(@RequestBody LoginRequest loginRequest,HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView modelAndView = new ModelAndView();
		String account = loginRequest.getAccount();
		
		userService.getByAccount(account);
		return modelAndView;
	}
	
}
