package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("Select p from Product p where "
			+ "p.name like concat('%', :query, '%') Or "
			+ "p.description like concat('%', :query, '%')")
	List<Product> searchProducts(String query);
}
