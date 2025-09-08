package com.ecommercePlatform.ecommercePlatform.service;

import com.ecommercePlatform.ecommercePlatform.model.Category;
import com.ecommercePlatform.ecommercePlatform.model.Product;
import com.ecommercePlatform.ecommercePlatform.repository.CategoryRepository;
import com.ecommercePlatform.ecommercePlatform.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private  CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository ,CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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

    public Product createProduct(Product product , Long categoryId){
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        product.setCategory(category);
     return    productRepository.save(product);
    }


}
