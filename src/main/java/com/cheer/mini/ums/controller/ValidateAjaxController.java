package com.cheer.mini.ums.controller;

import javax.servlet.http.HttpServletRequest;
<<<<<<< HEAD
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
=======

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.ums.dto.request.CustomerUserCreateRequest;
import com.cheer.mini.ums.model.User;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("/ums/validate")
public class ValidateAjaxController {

	@Autowired
	private UserService userService;

	/*@RequestMapping("/validateAjax")
	public ModelAndView validateAjax(@RequestBody LoginRequest loginRequest,
			HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = new ModelAndView();
		String account = loginRequest.getAccount();

		userService.getByAccount(account);
		return modelAndView;
	}*/

	@RequestMapping(value = "/validateAjax")
	public ResponseEntity<ResultEntity> validateRegister(
			final HttpServletRequest request,
			@RequestBody CustomerUserCreateRequest userparam)
			throws ServiceException, Exception {
		System.out.println("validateAjax~");
		ResultEntity result = null;
		
		User user = userService.getByAccount(userparam.getAccount());
		if (user == null) {
			result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,
					"可以使用", user);
		}else{
			result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_FAIL,
					"不可以使用", user);
		}
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<ResultEntity>(result, headers,
				HttpStatus.CREATED);
	}
}

