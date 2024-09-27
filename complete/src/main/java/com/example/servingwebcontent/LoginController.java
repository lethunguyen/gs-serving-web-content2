package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	

    public String login(@RequestParam(fname="fname", required=false, defaultValue="World") String fname, Model model) {
		model.addAttribute("fname", fname);
		return "index";
	}

}
