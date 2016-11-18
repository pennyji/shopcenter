package com.cheer.mini.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cheer.mini.ums.dao.UserDao;
import com.cheer.mini.ums.model.User;

@Controller
@RequestMapping("/ums/query")
public class QueryController {
	
	@Autowired
	private UserDao userDao;

	@RequestMapping("/doQuery")
	public ModelAndView query(){
		System.out.println("ok~");
		List<User> list = userDao.queryAll();
		System.out.println(list);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/ums/query");
		return modelAndView;
	}
	
}
