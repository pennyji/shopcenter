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
import org.springframework.web.util.UriComponentsBuilder;

import com.cheer.mini.base.Constants;
import com.cheer.mini.base.exception.ServiceException;
import com.cheer.mini.base.model.ResultEntity;
import com.cheer.mini.base.model.ResultEntityHashMapImpl;
import com.cheer.mini.ums.dto.request.LoginRequest;
import com.cheer.mini.ums.model.User;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("/ums/user")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/showLogin")
	public ModelAndView login(final HttpServletRequest request,
			final HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ums/login");
		return mv;
	}
	
	@RequestMapping("/login")
	public String toShowIndex(){
		return "redirect:/pms/product/showIndex";
	}

	@RequestMapping(value = "/validatelogin")
	public ResponseEntity<ResultEntity> validateLogin(
			final HttpServletRequest request,
			final HttpServletResponse response,
			@RequestBody LoginRequest loginRequest, UriComponentsBuilder builder)
			throws ServiceException, Exception {
		ResultEntity result = null;

		User user = userService.adminLogin(loginRequest.getAccount(),
				loginRequest.getPassword());

		request.getSession().setAttribute(Constants.CURRENT_USER, user);

		result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS,
				"登录成功", user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/ums/user/validatelogin")
				.buildAndExpand().toUri());
		return new ResponseEntity<ResultEntity>(result, headers,
				HttpStatus.CREATED);
	}

	@RequestMapping("/logout")
	public ModelAndView logout(final HttpServletRequest request,
			final HttpServletResponse response) {
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

	/*
	 * @RequestMapping("/index") public ModelAndView adminIndex(final
	 * HttpServletRequest request,final HttpServletResponse
	 * response,@RequestBody LoginRequest loginRequest) {
	 * System.out.println("adminIndex()..."); ModelAndView modelAndView = new
	 * ModelAndView(); User user =
	 * userService.adminLogin(loginRequest.getAccount(),
	 * loginRequest.getPassword()); if(user != null){ if
	 * (user.getAccountTypeFk() == Constants.AccountType.ACCOUNT_TYPE_CUSTOMER)
	 * { System.out.println("1"); modelAndView = new
	 * ModelAndView("ums/customerIndex"); } if (user.getAccountTypeFk() ==
	 * Constants.AccountType.ACCOUNT_TYPE_ADMIN) { System.out.println("2");
	 * modelAndView = new ModelAndView("ums/adminIndex"); } }
	 * 
	 * return modelAndView; }
	 */
	
}
