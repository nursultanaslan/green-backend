package com.nur.green_yesil.controller;

import com.nur.green_yesil.model.Gift;
import com.nur.green_yesil.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gift")
public class GiftController {
    @Autowired
    GiftRepository giftRepository;

    @GetMapping("/all/{user_id}")
    public List<Gift> all(@PathVariable("user_id") Integer id){
        return giftRepository.findAll();
    }

    @PutMapping("/add")
    public String add(@RequestBody Gift gift){
        giftRepository.save(gift);
        return "Bitki hediyeniz eklendi.";
    }

    @DeleteMapping("/delete/{gift_id}")
    public String delete(@PathVariable("id") Integer id){
        giftRepository.deleteById(id);
        return "Bitki hediyeniz silindi.";
    }


}
