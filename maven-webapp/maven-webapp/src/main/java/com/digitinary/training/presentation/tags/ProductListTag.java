package com.digitinary.training.presentation.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
public class ProductListTag extends SimpleTagSupport {
	
	//asdasd
	List<Object> prodcuts;
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();//returns the instance of JspWriter
		
		//write html code.
		Object obj = getJspContext().getAttribute("data");
		String html = null;
		
		out.write(html);
	}
}
