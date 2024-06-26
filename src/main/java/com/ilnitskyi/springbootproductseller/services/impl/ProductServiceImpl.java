package com.ilnitskyi.springbootproductseller.services.impl;

import com.ilnitskyi.springbootproductseller.model.Product;
import com.ilnitskyi.springbootproductseller.repository.ProductRepository;
import com.ilnitskyi.springbootproductseller.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
