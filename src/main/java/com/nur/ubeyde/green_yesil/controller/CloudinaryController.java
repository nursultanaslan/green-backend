package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Plant;
import com.nur.ubeyde.green_yesil.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*", maxAge = 3600)  //frontend icin (birden fazla uygulama baglamak icin)
@RestController         //@RequestBody ile @Controllerin birleşimi
@RequestMapping("/api")   //api urlsine gidildiginde bu sınıf aktif olur
public class CloudinaryController {

    @Autowired
    CloudinaryService cloudinaryService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file){
        try {

            return ResponseEntity.ok(cloudinaryService.uploadFile(file));

        }catch (Exception e){
            return ResponseEntity.status(500).body("dosya yüklenemedi. HATA:" + e.getMessage());
        }
    }

}
