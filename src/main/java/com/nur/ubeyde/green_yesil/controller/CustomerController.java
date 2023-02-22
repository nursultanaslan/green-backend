package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Customer;
import com.nur.ubeyde.green_yesil.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PutMapping("/register")
    public String register(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Müşteri kaydı başarılı";

    }

    @PostMapping("/update")
    public String update(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Müşteri başarıyla güncellendi";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        customerRepository.deleteById(id);
        return "Müşteri başarıyla silindi";

    }
}
