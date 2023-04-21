package com.vinsoft.microservices.serviceproduct.Repositories;

import com.vinsoft.microservices.serviceproduct.Entities.Category;
import com.vinsoft.microservices.serviceproduct.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
