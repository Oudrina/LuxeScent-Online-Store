package com.ecommercePlatform.ecommercePlatform.config;

import com.ecommercePlatform.ecommercePlatform.model.Category;
import com.ecommercePlatform.ecommercePlatform.model.Product;
import com.ecommercePlatform.ecommercePlatform.repository.CategoryRepository;
import com.ecommercePlatform.ecommercePlatform.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private  final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    public DataSeeder(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... args) throws Exception {


//        First delete all the repo first

        productRepository.deleteAll();
        categoryRepository.deleteAll();

//create categories

        Category floral = new Category();
        floral.setName("floral");

        Category Green = new Category();
        Green.setName("Green");

        Category Oriental = new Category();
        Oriental.setName("Oriental");

        categoryRepository.saveAll(Arrays.asList(floral,Green,Oriental));


//        Create Products

        Product Lavender = new Product();
        Lavender.setName("Lavender");
        Lavender.setDescription("Sweet scented for all men  and women");
        Lavender.setCategory(floral);
        Lavender.setPrice(129.99);
        Lavender.setImageUrl("https://placehold.co/600x400");


        Product Victoria = new Product();
        Victoria.setName("Victoria");
        Victoria.setDescription("Sweet scented for all ladies");
        Victoria.setCategory(Oriental);
        Victoria.setPrice(329.99);
        Victoria.setImageUrl("https://placehold.co/600x400");

        Product Philosophy = new Product();
        Philosophy.setName("Philosophy");
        Philosophy.setDescription("  Body philosophy");
        Philosophy.setCategory(Oriental);
        Philosophy.setPrice(109.99);
        Philosophy.setImageUrl("images/product1.png");

        productRepository.saveAll(Arrays.asList(Lavender,Victoria,Philosophy));

    }
}
