package com.nur.green_yesil.controller;

import com.nur.green_yesil.model.City;
import com.nur.green_yesil.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @GetMapping("/list")
    public List<City> getAll(){
        return cityRepository.findAll();
    }    //sadece listeleme yaptık. bütün sehirleri getirir.

}
