package com.zerobigazure.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
    @RequestMapping(value="/home", method = RequestMethod.GET)
	public String index() {
		return "Hello World with Spring Boot";
	}
    
}
