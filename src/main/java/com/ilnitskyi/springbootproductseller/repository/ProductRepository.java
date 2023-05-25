package com.ilnitskyi.springbootproductseller.repository;


import com.ilnitskyi.springbootproductseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
