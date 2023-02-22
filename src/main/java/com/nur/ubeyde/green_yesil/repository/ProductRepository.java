package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
