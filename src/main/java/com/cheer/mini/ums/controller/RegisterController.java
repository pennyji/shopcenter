package com.cheer.mini.ums.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.ums.dto.request.CustomerUserCreateRequest;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("/ums/register")
public class RegisterController {

	@Autowired
	private UserService userService;

	@RequestMapping("/showRegister")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("ums/register");
		return mv;
	}

	@RequestMapping(value = "/validateRegister")
	public ResponseEntity<ResultEntity> validateRegister(
			final HttpServletRequest request,
			@RequestBody CustomerUserCreateRequest userparam)
			throws ServiceException, Exception {
		System.out.println("validateRegister~");
		ResultEntity result = null;
		int user = userService.createUser(userparam);
		
		System.out.println(user);
		
		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,
				"注册成功", user);
		
		System.out.println(result);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<ResultEntity>(result, headers,
				HttpStatus.CREATED);
	}

	@RequestMapping("/index")
	public ModelAndView index(final HttpServletRequest request,
			final HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ums/index");
		return mv;
	}

}
