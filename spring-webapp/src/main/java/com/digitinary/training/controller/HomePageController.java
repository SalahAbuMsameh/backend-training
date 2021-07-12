package com.digitinary.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.digitinary.training.service.NameService;

/**
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
@Controller
public class HomePageController {
	
	@Autowired // dependency injection
	private NameService nameService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/home")
	public String homePage(Model model) {//result
		
		String name = this.nameService.getCurrentLogedInUsername();
		model.addAttribute("name", name);
		
		return "home";//template name
	}
}
