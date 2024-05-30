package com.example.demo.sp10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sp10")
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "sp10/index";
	}

	@GetMapping("/hello")
	public String input() {
		return "sp10/input";
	}

//	@PostMapping("/hello")
//	public String show() {
//		return "sp10/input";
//	}
}
