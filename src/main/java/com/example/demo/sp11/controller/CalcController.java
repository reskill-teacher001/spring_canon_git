package com.example.demo.sp11.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sp10")
public class CalcController {

	@GetMapping("/calc")
	public String index() {
		return "sp10/omikuji";
	}

	@GetMapping("/add")
	public String index(
			@RequestParam("num1") Integer num1,
			Model model
	) {
		String[] kuji = {"大吉", "吉", "凶", "吉", "小吉", "吉"};

		Random rand = new Random();
		int num = rand.nextInt(6);

		String result = kuji[num];
		model.addAttribute("result", result);

		return "sp10/omikuji";
	}
}
