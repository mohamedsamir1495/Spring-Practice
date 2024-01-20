package com.mohamedsamir1495.springdatajpa.product.repos;

import com.mohamedsamir1495.springdatajpa.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
