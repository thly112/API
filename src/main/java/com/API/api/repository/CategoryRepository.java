package com.API.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API.api.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
//	//tìm theo từ khóa
//	List<Category> findByCategoryNameContaining(String name);
//	//tìm có phân trang
//	Page<Category> findByCategoryNameContaining(String name, Pageable pagebale);
//	//tìm theo tên chính xác trả về có or không
//	Optional<Category> findByCategoryName(String name);
}
