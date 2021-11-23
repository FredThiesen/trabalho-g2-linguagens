package com.example.g2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.g2.entities.Product;
import com.example.g2.repositories.ProductRepositorie;

@Service
public class ProductService {

	@Autowired
	private ProductRepositorie productRep;

	public List<Product> findAll() {
		return productRep.findAll();
	}

	public Product findProduct(String name) {
		Product p = productRep.findProduct(name);
		return p;
	}

}
