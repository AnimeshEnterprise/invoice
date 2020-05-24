package com.retail.service;

import java.util.List;
import java.util.Optional;

import com.retail.model.Product;

public interface ProductService {

	Optional<Product> getProductById(Long id);

	List<Product> getProducts();

	Product addProduct(Product product);

	Product updateProduct(Product product);

	Product deleteProduct(Long id);

}
