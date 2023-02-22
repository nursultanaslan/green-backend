package com.nur.ubeyde.green_yesil.repository;

import com.nur.ubeyde.green_yesil.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {


}
