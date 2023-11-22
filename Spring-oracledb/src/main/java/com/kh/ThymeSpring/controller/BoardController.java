package com.kh.ThymeSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.ThymeSpring.service.*;
import com.kh.ThymeSpring.model.*;
@Controller
public class BoardController {

	 @Autowired
	    private BoardService boardService;
	 
	   @GetMapping("BoardList")
	    public String displayProductList(Model model) {
	    	//model.addAttribute("products","제품 저장할 공간");
	    	model.addAttribute("boards",boardService.getAllBoard());
	        return "BoardList";
	    }
}
