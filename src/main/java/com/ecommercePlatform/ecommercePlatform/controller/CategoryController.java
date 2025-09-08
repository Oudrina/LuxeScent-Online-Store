package com.ecommercePlatform.ecommercePlatform.controller;

import com.ecommercePlatform.ecommercePlatform.model.Category;
import com.ecommercePlatform.ecommercePlatform.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private  final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/create")
    public Category createCategory( @RequestBody Category category){
         return  categoryService.createCategory(category);
    }
}
