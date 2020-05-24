package com.retail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Product;
import com.retail.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Optional<Product> getProductById(Long id) {
		log.info("getProductById method is called");
		return productRepository.findById(id);
	}

	@Override
	public List<Product> getProducts() {
		log.info("getProducts method is called");
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		log.info("addProduct method is called");
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		log.info("updateProduct method is called");
		return productRepository.save(product);
	}

	@Override
	public Product deleteProduct(Long id) {
		log.info("deleteProduct method is called");
		Optional<Product> product = productRepository.findById(id);
		productRepository.delete(product.get());
		return product.get();
	}

}
