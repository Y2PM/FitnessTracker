package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("greeting", "Hello World");
		
		return "hello";//This "hello" means it will tie to the hello.jsp page
	}
	
}
