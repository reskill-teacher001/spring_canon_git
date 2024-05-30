package com.example.demo.sp20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sp20")
public class ContactController {

	@GetMapping("/contact")
	public String index() {
		return "sp20/contactForm";
	}

	@PostMapping("/contact")
	public String contact(
			@RequestParam(name="name", required=false) String name,
			@RequestParam("email") String email,
			Model model
	) {
		
		if (name == null) {
			return "sp20/contactForm";
		}
		
		if (name.equals("")) {
			model.addAttribute("error", "名前は必須です");
			return "sp20/contactForm";
		}
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);

		return "sp20/contactResult";
	}
}
