package com.cheer.mini.ums.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ums/contactUs")
public class ContactController {
	
	@RequestMapping("/toContact")
	public ModelAndView toContactUs(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("/common/contacts");
		return mv;
		
	}

}
