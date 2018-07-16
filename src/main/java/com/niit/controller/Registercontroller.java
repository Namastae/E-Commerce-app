package com.niit.controller;

/*public class RegisterController 
{
	

}*/


//package com.mobile.controller;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.Registerdao;
import com.niit.model.Register;
@Controller(value="registerController")
public class Registercontroller 
{
	
	@Autowired
	Registerdao registerdao;
	
	
		

	@RequestMapping(value="Register", method=RequestMethod.GET)
	public ModelAndView getLogin(Register register)
	{
			System.out.println("Register");	
			ModelAndView model=new ModelAndView("Register");
			return model;
	}
	
	
	@RequestMapping(value="Register", method=RequestMethod.POST)
	public ModelAndView Success(@ModelAttribute("Register")Register reg, Model m)
	{
			registerdao.addUser(reg);
			ModelAndView model=new ModelAndView("login","Register", new Register());
			return model;
	}
	

	
}