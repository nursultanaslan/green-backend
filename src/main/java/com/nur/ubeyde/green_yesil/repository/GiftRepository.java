package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepository extends JpaRepository<Gift, Integer> {
}
