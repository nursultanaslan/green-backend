package com.nur.ubeyde.green_yesil.model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data  //get-set fonksiyonlarını getiriyor
@AllArgsConstructor //tüm sütunların parametre olarak alındıgı yapıcı fonksiyonu oluşturuyor
@NoArgsConstructor  //bos bir yapıcı fonksiyon oluşturuyor
@Entity           //bu sınıfın bir entity oldugunu belirtmek icin
@Table(name="plants")  //entityi plants tablosuna baglıyor



public class Plant {
    @Id              //primary key icindir.
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Tablo id değerinin otomatik arttıgını belirtmek icin
    private Integer id;

    private String photoURL;
    private String commonName;
    private String botanicalName;
    private String soilType;
    private Float height;
    private String information;
    private String category;       //category nesnesi ile PlantCategory sınıfının özellikleri Plant sınıfına eklendi.

}
