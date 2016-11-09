package com.cheer.mini.ums.controller;

import java.util.List;

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
import com.cheer.mini.ums.dto.request.CustomerUserCreateRequest;
import com.cheer.mini.ums.dto.request.LoginRequest;
import com.cheer.mini.ums.model.User;
import com.cheer.mini.ums.service.UserService;

@Controller
@RequestMapping("/ums/user")
public class LoginController {

    @Autowired
    private UserService userService;
    /*
     * 
     * 进入首页的路径跳转的是一个controller
     * 
     * */
    @RequestMapping("/login")
    public String login(final HttpServletRequest request, final HttpServletResponse response) {
//        ModelAndView mv = new ModelAndView("pms/commodity/All");
    	//直接跳转action
        return "redirect:/pms/commodity/all";
    }
    
	
	/*
	 * 
	 * 用户登录，并根据不同的用户类型跳转页面
	 * 
	 * 
	 * */

    @RequestMapping(value = "/validatelogin")
    public ResponseEntity<ResultEntity> validateLogin(final HttpServletRequest request, @RequestBody LoginRequest loginRequest, UriComponentsBuilder builder) throws ServiceException, Exception {
       
    	ResultEntity result = null;
        User user = userService.adminLogin(loginRequest.getAccount(), loginRequest.getPassword());
        request.getSession().setAttribute(Constants.CURRENT_USER, user);
        result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS, "登录成功", user);
        System.out.println(result);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/ums/user/validatelogin").buildAndExpand().toUri());
        return new ResponseEntity<ResultEntity>(result, headers, HttpStatus.CREATED);
    }
    
    /*
     * 用户注册注册用的方法
     * 
     * */
    @RequestMapping("/register")
    public ResponseEntity<ResultEntity> register(final HttpServletRequest request, @RequestBody CustomerUserCreateRequest customerUserCreateRequest) 
    		throws ServiceException, Exception {
    	ResultEntity result = null;
    	int user=userService.createUser(customerUserCreateRequest);
    	 result = new ResultEntityHashMapImpl(ResultEntity.KW_STATUS_SUCCESS, "注册成功",user);
    	 HttpHeaders headers = new HttpHeaders();
    	 return new ResponseEntity<ResultEntity> (result,headers,HttpStatus.CREATED);
    }
    
    
    /*
     * 
     * 用户查看个人信息
     * 
     * */
    @RequestMapping("/seeuser")
    public ModelAndView seeuser(@RequestParam("userid") String name) {
       User user= userService.get(name);
    	ModelAndView mv = new ModelAndView();
    	mv.addObject(Constants.CURRENT_USER, user);
    	mv.setViewName("ums/user");
        return mv;
    }
    	/*
    	 * 
    	 * 用户退出的登录的方法，就是关闭session
    	 * 
    	 * */
    
    @RequestMapping("/logout")
    public ModelAndView logout(final HttpServletRequest request, final HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("ums/login");
        request.getSession().removeAttribute(Constants.CURRENT_USER);
        return mv;
    }
    	/*
    	 * 管理员登录成功后跳转到管理页面
    	 * 
    	 * */
    @RequestMapping("/index")
    public ModelAndView index(final HttpServletRequest request, final HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("ums/index");
        return mv;
    }
    	/*
    	 * 
    	 * 跳转到管理用户的JSP
    	 * 
    	 * */
    @RequestMapping("/adminuser")
    public ModelAndView adminuser(final HttpServletRequest request, final HttpServletResponse response) {
    	List<User> list=userService.getUserAll();
    	ModelAndView mv = new ModelAndView();
    	mv.addObject(Constants.CURRENT_USER, list);
    	mv.setViewName("ums/adminuser");
        return mv;
    }
}
