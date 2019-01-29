package com.andronvd.SpringBootInternationalization.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/international")
	public String getInternationPage() {
		return "international";
	}
	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
	
}
