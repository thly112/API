package com.API.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.api.model.Product;
import com.API.api.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProductsByCategory(Long cId){
		return productRepository.findByCategoryId(cId);
	}
	public List<Product> getTop10BestSellingProduct(){
		return productRepository.findTop10ByQuantitySold();
	}
	public List<Product> getTop10RecentProducts(){
		return productRepository.findTop10ByCreateAt7Days();
	}
}
