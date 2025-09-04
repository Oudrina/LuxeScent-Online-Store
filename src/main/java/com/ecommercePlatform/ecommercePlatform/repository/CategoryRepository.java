package com.ecommercePlatform.ecommercePlatform.repository;

import com.ecommercePlatform.ecommercePlatform.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}

