package com.retail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.model.Product;
import com.retail.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j(topic = "ProductController")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable Long id) {
		log.info("getProductById method is called");
		return productService.getProductById(id);
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		log.info("getProducts method is called");
		return productService.getProducts();
	}

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		log.info("addProduct method is called");
		return productService.addProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		log.info("updateProduct method is called");
		return productService.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	public Product deleteProduct(@PathVariable Long id) {
		log.info("deleteProduct method is called");
		return productService.deleteProduct(id);
	}

}
