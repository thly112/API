package com.API.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.API.api.model.Response;
import com.API.api.service.ProductService;

@Controller
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category/{cId}")
	public ResponseEntity<?> getProductsByCategoryId(@PathVariable Long cId){
		return new ResponseEntity<>(new Response(true, "Thành Công", productService.getProductsByCategory(cId)), HttpStatus.OK);
	}
	@GetMapping("/top-selling")
	public ResponseEntity<?> getTop10BestSellingProducts(){
		return new ResponseEntity<>(new Response(true, "Thành Công", productService.getTop10BestSellingProduct()), HttpStatus.OK);
	}
	@GetMapping("/top-recent")
	public ResponseEntity<?> getTop10RecentProducts(){
		return new ResponseEntity<>(new Response(true, "Thành Công", productService.getTop10RecentProducts()), HttpStatus.OK);
	}
}
