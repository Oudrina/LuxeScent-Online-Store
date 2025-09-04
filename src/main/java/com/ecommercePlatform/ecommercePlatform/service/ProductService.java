package com.ecommercePlatform.ecommercePlatform.service;

import com.ecommercePlatform.ecommercePlatform.model.Product;
import com.ecommercePlatform.ecommercePlatform.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts() {
        return  productRepository.findAll();
    }

    public  Product getProductById(Long productId){
        return  productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product id not found"));

    }

    public List<Product> findByCategoryById(Long categoryId) {
       return productRepository.findByCategoryId(categoryId);
    }


}
