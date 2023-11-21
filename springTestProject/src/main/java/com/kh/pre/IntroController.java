package com.kh.pre;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IntroController {
	@RequestMapping("/sample")
	public String getIntro() {
		return "sample";
	}
	
}
