package com.ecommercePlatform.ecommercePlatform.controller;

import com.ecommercePlatform.ecommercePlatform.model.Product;
import com.ecommercePlatform.ecommercePlatform.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
       List<Product> products =productService.getAllProducts();
       return products;
    }

    @GetMapping("/{productId}")
    public  Product getProductById(@PathVariable Long productId){
        return  productService.getProductById(productId);
    }
    @GetMapping("/categories/{categoryId}")
    public List<Product> getProductByCategoryId( @PathVariable  Long categoryId){
        return   productService.findByCategoryById(categoryId);
    }
}
