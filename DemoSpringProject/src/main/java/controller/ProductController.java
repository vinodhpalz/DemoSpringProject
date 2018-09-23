package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Product;

@Controller
public class ProductController {
	
	//This is a web method

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String productsPage()
	{
		return "product";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String productSuccess(@ModelAttribute("product1") Product product) {
		
		return "success";
	}
	
	@RequestMapping(value="/abc", method=RequestMethod.GET)
	public String productHome()
	{
		return "home";
	}
	
}
