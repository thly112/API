package com.API.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.api.model.Response;
import com.API.api.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<?> getAllCategories()
	{
//		return ResponseEntity.ok(categoryService.getAllCategories());
		return new ResponseEntity<Response>(new Response(true, "Thành công", categoryService.getAllCategories()), HttpStatus.OK);
	}

}
