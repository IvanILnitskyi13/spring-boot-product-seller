package com.ilnitskyi.springbootproductseller.services;

import com.ilnitskyi.springbootproductseller.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
