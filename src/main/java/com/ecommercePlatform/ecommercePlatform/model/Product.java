package com.ecommercePlatform.ecommercePlatform.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    private String description;
    private  String imageUrl;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id" ,nullable = false)
    private Category category;
}
