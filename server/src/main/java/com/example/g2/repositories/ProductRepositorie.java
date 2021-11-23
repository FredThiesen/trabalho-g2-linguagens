package com.example.g2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.g2.entities.Product;



public interface ProductRepositorie extends JpaRepository<Product, Long> {

	@Query(value = "select * from tb_product u where u.name = ?1", nativeQuery = true)
	Product findProduct(String name);
}
