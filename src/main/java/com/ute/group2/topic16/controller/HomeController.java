package com.ute.group2.topic16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		return "index";
	}
}
