package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Review;
import com.nur.ubeyde.green_yesil.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping("/all/{product_id}")
    public List<Review> getAllByProduct(@PathVariable("product_id") Integer id){
        return reviewRepository.findAll();
    }
    @PutMapping("/add")
    public String add(@RequestBody Review review){
        reviewRepository.save(review);
        return "İncelemeniz yayınlandı.";
    }

    @PostMapping("/update")
    public String update(@RequestBody Review review){
        reviewRepository.save(review);
        return "İncelemeniz güncellendi.";
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable("id") Integer id){
        reviewRepository.deleteById(id);
        return "İncelemeniz kaldırıldı";
    }


}
