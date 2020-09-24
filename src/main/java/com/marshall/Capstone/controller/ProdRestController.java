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

import com.marshall.Capstone.model.Products;
import com.marshall.Capstone.repository.ProdRepository;

@RestController
@RequestMapping ("/capstone")
public class ProdRestController {
	
	@Autowired
	private ProdRepository prodRepository;
	
	
	
	 //@GetMapping(value = {"/products","/products/{key}"})
	//public List<Products> getAllProd(@PathVariable(value = "key") String prodSKey, Model model) {
	@GetMapping("/products")
	 public List<Products> getAllProd(Model model) {
		 //if(prodSKey.length() > 0) {
		//	 return this.prodRepository.searchCategories(prodSKey);
		// }
	  	
	 return this.prodRepository.findAll();
	}
	

	@GetMapping("/product/{id}")
	 public ResponseEntity<Products>
	getProdById(@PathVariable(value = "id") Long prodId)
		throws ResourceNotFoundException {
	   Products prod = prodRepository.findById(prodId)
	    .orElseThrow(() -> new ResourceNotFoundException("Products not found for this id :: " + prodId));
	   return ResponseEntity.ok().body(prod);
	 
	 }
	
	 @PostMapping("/product")
	 public Products createProd(@Valid @RequestBody Products prod) {
		 return prodRepository.save(prod);
	 }
	 
	 @PostMapping("/products")
	 public boolean createProd(@Valid @RequestBody Products[] prods) {
		 for (Products prod: prods) {
			 prodRepository.save(prod);
		 }
		 return true;
	 }
	

}
