package com.ric.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyFirstController {
   

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String greetings() {
        return "<h1> Spring Boot Rocks in Java too!</h1>";
    }

    
    
    

}
