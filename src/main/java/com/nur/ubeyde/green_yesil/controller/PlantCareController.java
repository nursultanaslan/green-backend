package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.PlantCare;
import com.nur.ubeyde.green_yesil.repository.PlantCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantCare")
public class PlantCareController {
    @Autowired
    PlantCareRepository plantCareRepository;

    @GetMapping("/all/{category_id}")
    public List<PlantCare> getAllByCategory(@PathVariable("category_id") Integer id){
        return plantCareRepository.findAll();
    }
    @PostMapping("/update")
    public String update(@RequestBody PlantCare plantCare){
        plantCareRepository.save(plantCare);
        return "Bitki Bakımı metniniz güncellendi.";
    }

    @GetMapping("/all/user_id")
    public List<PlantCare> getAllByUser(@PathVariable("user_id") Integer id){
        return plantCareRepository.findAll();
    }

    @DeleteMapping("/delete/{plantcare_id}")
    public String delete(@PathVariable("id") Integer id){
        plantCareRepository.deleteById(id);
        return "Bitki Bakımı metniniz silindi.";

    }


}
