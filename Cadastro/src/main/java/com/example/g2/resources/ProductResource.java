package com.example.g2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.g2.entities.Product;
import com.example.g2.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> lista=productService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value = "/{name}")
	public ResponseEntity<Product> findProduct(@PathVariable String name){
		Product product=productService.findProduct(name);
		return ResponseEntity.ok().body(product);
	}
	
}
