package com.sarief.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Main page
 * @author Andrii
 *
 */
@Controller
public class MainPage {
	
	@ResponseBody
	@RequestMapping("/")
	public String testMeMethod(){
		return "This is main page! to access REST go to /webapi/invoices.";
	}
	
}
