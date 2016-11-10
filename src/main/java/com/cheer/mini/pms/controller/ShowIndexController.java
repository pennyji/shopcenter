package com.cheer.mini.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pms/product")
public class ShowIndexController {
	
	@RequestMapping("/showIndex")
	public ModelAndView showIndex(){
				
		ModelAndView modelAndView = new ModelAndView("pms/index");

		return modelAndView;
	}
	
}
