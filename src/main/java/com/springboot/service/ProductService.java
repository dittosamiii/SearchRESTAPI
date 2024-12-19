package com.springboot.service;

import java.util.List;

import com.springboot.entity.Product;

public interface ProductService {
	List<Product> searchProducts(String query);

	Product addProduct(Product product);
}
