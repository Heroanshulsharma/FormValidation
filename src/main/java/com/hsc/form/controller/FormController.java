package com.hsc.form.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hsc.form.model.LoginData;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		System.out.println("Opening form");
		model.addAttribute("loginData", new LoginData());
		return "form";
		
	}
	
	
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
		
	}
}
