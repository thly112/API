package com.API.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.API.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
//	List<Product> findByProductNameContaining(String name);
//	Page<Product> findByProductNameContaining(String name, Pageable pageable);
//	Optional<Product> findByProductName(String name);
//	Optional<Product> findByCreateDate(Date createAt);
	
	List<Product> findByCategoryId(Long cId);
	@Query("SELECT p FROM Product p ORDER BY p.quantitySold DECS LIMIT 10")
	List<Product> findTop10ByQuantitySold();
	@Query("SELECT p FROM Product p WHERE p.createAt >= CURRENT_DATE - 7")
	List<Product> findTop10ByCreateAt7Days();
}
