package com.digitinary.training.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digitinary.training.service.product.MainProductService;

/**
 * Entry point for your application.
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
public class MyMainServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getAttribute("Action");
		
		Object obj = new MainProductService().doSomething();//do a specific logic based on the given action
		req.setAttribute("data", obj);
		
		req.getRequestDispatcher("/path-to-jsp-page.jsp");
	}
}
