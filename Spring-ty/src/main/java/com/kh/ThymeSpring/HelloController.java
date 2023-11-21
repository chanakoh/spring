package com.kh.ThymeSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/good")
	public String hello(Model model) {
		model.addAttribute("test","안녕하세요");
		return "hell";
	}
}
