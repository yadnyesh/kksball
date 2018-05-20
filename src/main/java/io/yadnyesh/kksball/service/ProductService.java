package io.yadnyesh.kksball.service;

import io.yadnyesh.kksball.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
	
	public Product getProduct(String id) {
		LOGGER.info("getProduct called for id: {}", id);
		return new Product(id, "0826663141405", "The Angry Beavers: The Complete Series");
	}
}
