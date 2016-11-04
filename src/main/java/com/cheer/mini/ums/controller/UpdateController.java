package com.cheer.mini.ums.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.ums.dao.UserDao;
import com.cheer.mini.ums.model.User;

@Controller
@RequestMapping("/ums/userUpdate")
public class UpdateController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/update")
	public ModelAndView update(){
		ModelAndView modelAndView = new ModelAndView("/ums/update");
		return modelAndView;
	}
	
	@RequestMapping("/showEdit")
	public ModelAndView showEdit(HttpServletRequest request){
		String account = request.getParameter("account");
		User user = userDao.getByAccount(account);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("/ums/showEdit");
		return modelAndView;
	}
	
	/*@RequestMapping("/doUpdate")
	public ModelAndView doUpdate(HttpServletRequest request){
		String account = request.getParameter("account");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		User user = new User();
		System.out.println(account);
		user.setAccount(account);
		user.setName(name);
		user.setNickname(nickname);
		userDao.update(user);
		ModelAndView modelAndView = new ModelAndView("/ums/index");
		return modelAndView;
	}*/
	
	@RequestMapping("/doUpdate")
	public ModelAndView doUpdate(@ModelAttribute User user){
//		String account = request.getParameter("account");
//		String name = request.getParameter("name");
//		String nickname = request.getParameter("nickname");
//		User user = new User();
//		System.out.println(account);
//		user.setAccount(account);
//		user.setName(name);
//		user.setNickname(nickname);
		userDao.update(user);
		ModelAndView modelAndView = new ModelAndView("/ums/index");
		return modelAndView;
	}
	
}
