package com.home.loan.homepage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomePageController {
	
	@GetMapping("/getLoanForCustomer")
	public ResponseEntity<?> getUserLoanDetails() {
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@GetMapping("/getLoansForAdmin")
	public ResponseEntity<?> getAdminLoanDetails() {
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
