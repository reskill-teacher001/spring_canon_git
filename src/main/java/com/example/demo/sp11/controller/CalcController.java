package com.example.demo.sp11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sp11")
public class CalcController {

	@GetMapping("/calc")
	public String index() {
		return "sp11/calc";
	}

	@GetMapping("/add")
	public String index(
			@RequestParam("num1") Integer num1,
			@RequestParam("num2") Integer num2,
			Model model
	) {
		
		Integer result = num1 + num2;
		model.addAttribute("result", result);

		return "sp11/calc";
	}
}
