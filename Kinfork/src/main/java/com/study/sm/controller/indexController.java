package com.study.sm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {
	@RequestMapping("/")
//	@GetMapping("/")
	public ModelAndView main() {
		return new ModelAndView("index");
	}
}
