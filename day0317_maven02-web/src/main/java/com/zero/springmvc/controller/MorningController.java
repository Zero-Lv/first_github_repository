package com.zero.springmvc.controller;

import org.ietf.jgss.Oid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *	@date:2020年3月29日 上午8:25:11
 *	@author:Zero
 *	@version:Future
 *	@description: 
 *
 */
@Controller
public class MorningController {

	@RequestMapping("/morning")
	public String goodMorning() {
		return "morning";
	}
	
}
