package com.nur.green_yesil.repository;

import com.nur.green_yesil.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {
    List<Plant> findByCommonNameIgnoreCaseContaining(String commonName);
    List<Plant> findAllByOrderByHeight();

}
