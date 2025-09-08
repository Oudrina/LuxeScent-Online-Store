package com.ecommercePlatform.ecommercePlatform.controller;

import com.ecommercePlatform.ecommercePlatform.model.Product;
import com.ecommercePlatform.ecommercePlatform.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product>  getAllProducts() {
        List<Product> products = productService.getAllProducts();

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

    @PostMapping("/save/{categoryId}")
    public Product createProduct(@RequestBody Product product ,@PathVariable Long categoryId){
       return productService.createProduct(product ,categoryId);

    }
}
