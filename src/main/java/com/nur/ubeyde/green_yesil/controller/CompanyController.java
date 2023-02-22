package com.nur.ubeyde.green_yesil.controller;


import com.nur.ubeyde.green_yesil.model.Company;
import com.nur.ubeyde.green_yesil.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
public class CompanyController  {
    @Autowired
    CompanyRepository companyRepository;

    @PutMapping("/register")
    public String register(@RequestBody Company company){         //Tüm özellikleri isteyecegimiz icin @RequestBody kullanmamız daha mantıklı.
        companyRepository.save(company);                                //..bir iki özellik istememiz gerekirse digerleri daha mantıklı olur.
        return "şirket kaydı başarılı.";
    }

    @PostMapping("/update")
    public String update(@RequestBody Company company){
        companyRepository.save(company);
        return "şirket güncelleme başarılı.";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer company_id){
        companyRepository.deleteById(company_id);
        return "kayıtlı şirket silindi.";

    }



}
