package com.howtodoinjava.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/access")
public class DemoController 
{
    String test1="cc3";
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) 
	{
		String str2="label";
		model.addAttribute("message", "Spring 3 MVC Hello World !! Thanks to www.howtodoinjava.com");
		return "helloWorld43";
	}
}
