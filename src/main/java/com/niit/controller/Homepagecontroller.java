
package com.niit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homepagecontroller 
{
	@RequestMapping(value="/aboutus")
	public String Aboutus()
	{
		return "aboutus";
	}
	
	@RequestMapping(value="/contactus")
	public String Contactus()
	{
		return "contactus";
	}
	
	@RequestMapping(value="/login")
	public String Login()
	{
		return "login";
	}
	
	//@RequestMapping(value="/register")
	//public String Register()
	//{
	   // return "Register";
	//}
	
	

}
