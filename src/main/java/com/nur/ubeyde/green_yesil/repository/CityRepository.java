package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Short> {
}
