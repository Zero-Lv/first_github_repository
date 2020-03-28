package com.zero.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *	@date:2020年3月29日 上午7:54:27
 *	@author:Zero
 *	@version:Future
 *	@description: 
 *
 */
@Controller
public class ResponseController {

	@RequestMapping("/response")
	public String response() {
		return "response";
	}
}
