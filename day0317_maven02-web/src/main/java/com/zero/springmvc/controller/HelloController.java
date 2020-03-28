package com.zero.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *	@date:2020年3月18日 上午6:27:54
 *	@author:Zero
 *	@version:Future
 *	@description: 
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/sayhello")
	public String sayHello(Model m) {
		m.addAttribute("username", "Mia");
		
		return "/WEB-INF/view/hello.jsp";
	}
}
