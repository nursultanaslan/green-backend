package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
