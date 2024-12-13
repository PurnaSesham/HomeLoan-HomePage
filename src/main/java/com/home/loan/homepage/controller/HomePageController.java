package com.home.loan.homepage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomePageController {
	
	@GetMapping("/getUserLoanDetails")
	public String getLoanDetails() {
		
		return "User home loan details";
		
	}
	
	@PostMapping("/loginHomeLoan")
	public ResponseEntity<?> userEndPoint(@RequestBody LoginRequest LoginRequest) {
		
		return new ResponseEntity<>(LoginRequest, HttpStatus.OK);
		
	}
	
	 @GetMapping("/get-header")
	    public ResponseEntity<String> getHeader(@RequestHeader("Authorization") String customHeader, HttpServletRequest request) {
		 String authorizationHeader = request.getHeader("Authorization");   
		 System.out.println(authorizationHeader);
		 return ResponseEntity.ok("Header value: " + customHeader);
	        
	    }

}
