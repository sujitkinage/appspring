package com.kinage.appspring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
   
@Controller    
public class HomeController {  
	private Logger logger = Logger.getLogger(HomeController.class);
	
/*	@RequestMapping("/home")  
	 public ModelAndView getHome() {  
		
	  String string = "Congrats ! You are done with your first Spring Security configuration !";
	  logger.info("This is an info log entry");
      logger.error("This is an error log entry");
	  return new ModelAndView("home", "string", string);  
	 }  */
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)  
	public String printWelcome(ModelMap model) {  
        model.addAttribute("message", "Hello! This is Spring MVC Web Controller.");
        
        logger.info("This is an info log entry");
        logger.error("This is an error log entry");
        
        return "home";  
    }  
}
