package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Product;
import com.nur.ubeyde.green_yesil.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> all(){
        return productRepository.findAll();
    }
    @GetMapping("/all/{category_id}")
    public List<Product> getByCategory(@PathVariable("category_id") Integer id){
        return productRepository.findAll();
    }

    @PutMapping("/add")
    public String add(@RequestBody Product product){
        productRepository.save(product);
        return "Yeni ürün eklendi.";
    }

    @PostMapping("/update")
    public String update(@RequestBody Product  product){
        productRepository.save(product);
        return "Ürün bilgileriniz güncellendi.";

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        productRepository.deleteById(id);
        return "Ürün silindi";
    }

}
