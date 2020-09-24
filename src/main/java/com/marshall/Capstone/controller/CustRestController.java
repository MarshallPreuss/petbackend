package com.marshall.Capstone.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marshall.Capstone.model.Customer;
import com.marshall.Capstone.repository.CustRepository;

@RestController
@RequestMapping ("/capstone")
public class CustRestController {
	
	@Autowired
	private CustRepository custRepository;
	
	
	
	 @GetMapping("/customer")
	 public List<Customer> getAllCust(Model model) {
	  	
	 return this.custRepository.findAll();
	}
	
	 @GetMapping("/customer/{id}")
	 public ResponseEntity<Customer> getCustById(@PathVariable(value = "id") Long custId)
	   throws ResourceNotFoundException {
	   Customer cust = custRepository.findById(custId)
	    .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + custId));
	   return ResponseEntity.ok().body(cust);
	 }
	
	 @PostMapping("/customer")
	 public Customer createCust(@Valid @RequestBody Customer cust) {
		 return custRepository.save(cust);
	 }
	

}

