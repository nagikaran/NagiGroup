package com.nagi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	    @GetMapping("/hello")
	    @Operation(summary  = "Say Hello", description  = "Returns a greeting message")
	    public String sayHello() {
	        return "Hello, World!";
	    }
}
