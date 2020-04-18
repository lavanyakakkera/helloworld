package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public ModelAndView helloWorld(@RequestParam(name="name",required=false,defaultValue="HelloWorld") String name,Model model) {
		
		ModelAndView hello = new ModelAndView("helloworld");
		hello.addObject("name",name);
		return hello;		
	}

}
