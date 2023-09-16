package com.nur.green_yesil.controller;

import com.nur.green_yesil.model.Favorite;
import com.nur.green_yesil.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController {

    @Autowired
    FavoriteRepository favoriteRepository;

    @GetMapping("/userFavorites/{user_id}")
    public List<Favorite> userFavorites(@PathVariable("user_id") Integer id){

        return favoriteRepository.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Favorite favorite){
        favoriteRepository.save(favorite);
        return "Favoriniz eklendi.";

    }

    @DeleteMapping("/delete/{favorite_id}")
    public String delete(@PathVariable("favorite_id") Integer id){
        favoriteRepository.deleteById(id);
        return "Favoriniz silindi";
    }
}
