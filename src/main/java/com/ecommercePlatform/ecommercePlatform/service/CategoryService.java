package com.ecommercePlatform.ecommercePlatform.service;

import com.ecommercePlatform.ecommercePlatform.model.Category;
import com.ecommercePlatform.ecommercePlatform.repository.CategoryRepository;
import com.ecommercePlatform.ecommercePlatform.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private  final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> getAllCategories() {
        return  categoryRepository.findAll();
    }
}
