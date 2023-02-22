package com.nur.ubeyde.green_yesil.controller;


import com.nur.ubeyde.green_yesil.model.Plant;
import com.nur.ubeyde.green_yesil.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)  //frontend icin (birden fazla uygulama baglamak icin)
@RestController         //@RequestBody ile @Controllerin birleşimi
@RequestMapping("/api/plant")   //api urlsine gidildiginde bu sınıf aktif olur
public class PlantController {

    @Autowired //PlantRepository sınıfı otomatik olarak baglanır. new kullandıgımız icin sınıf bilgileri sıfırlanmaz.
    PlantRepository plantRepository;



    @GetMapping("/plants")  //icine yazdıgımız urlye gittigimizde fonksiyon calısr.
    public ResponseEntity<?> getPlants(){
        try {
            return ResponseEntity.ok(plantRepository.findAll());

        }catch (Exception e){
            return ResponseEntity.badRequest().body("bitki listesi getirilemedi. HATA:" + e.getMessage());
        }
    }


    @PostMapping("/newPlant")
    public ResponseEntity<?> newPlant(@RequestBody Plant plant){     //RequestBody ile JSON dosyası istek alıyor.
        try {
            plantRepository.save(plant);
            return ResponseEntity.ok(plantRepository.findAll());

        }catch (Exception e){
            return ResponseEntity.badRequest().body("yeni bitki eklenmedi. HATA:" + e.getMessage());
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer plant_id){
        try {
            plantRepository.deleteById(plant_id); // burada parametre olarak gönderılen plant_ıd degıskenını reposıtory e gönderıp bıtkıyı sılıyor
            return ResponseEntity.ok(plant_id + " numaralı bıtkı basarıyla sılındı."); // sılme ıslemı bıttıkten sonra fındAll() fonksıyonu ıle tum bıtkılerı dönduruyor

        }catch (Exception e){
            return ResponseEntity.badRequest().body("bitki silinemedi. HATA:" + e.getMessage());
        }
    }




}
