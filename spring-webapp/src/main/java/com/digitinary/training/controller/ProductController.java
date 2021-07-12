package com.digitinary.training.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.digitinary.training.service.ProductService;

/**
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/**
	 * view products page.
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@GetMapping("/products")
	public String produtsPage(HttpServletRequest request, Model model) {
		
		System.out.println(request);
		model.addAttribute("ps", productService.getAllProdcuts());
		return "products";
	}
}
