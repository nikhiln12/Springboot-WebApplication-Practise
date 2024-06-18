package com.webapp.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebAppController {

	@GetMapping("/home")
	public ModelAndView home(Alien alien) {
		ModelAndView modView = new ModelAndView();
		modView.addObject("obj", alien);
		modView.setViewName("home");
		return modView;
	}
}
