package com.nur.ubeyde.green_yesil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data    //get-set fonksiyonlarını döndürür
@AllArgsConstructor   //Tüm parametreleri alan constructur(yapıcı) fonksiyonu döndürür.
@NoArgsConstructor    //Parametresiz (boş) constructor döndürür.
@Entity               //sınıfın kalıcı bir java sınıfı oldugunu belirtir.(entity veritabanımız ile yazılım arasında ilişki kurmamızı sağlayan kalıcı nesneler olarak tanımlanabilir.)
@Table(name = "cities")    //bu entity'e eşlenen tabloyu sağlar. (entity'i cities tablosuna  baglar.)
public class City {
    @Id              //Primary key icindir.
    @GeneratedValue(strategy = GenerationType.IDENTITY)      //Tablo id değerinin otomatik arttığını belirtmek icin.
    private Short id;

    private String name;
}
