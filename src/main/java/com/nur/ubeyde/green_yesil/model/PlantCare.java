package com.nur.ubeyde.green_yesil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plant_care")
public class PlantCare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String photo_url;
    private String careCategory;


    private String watering;
    private String light;
    private String warmth;
    private String benefit;
    private String cateFriendliness;


    private LocalDate creationDate;
    private LocalDate editDate;

    private Integer plant_id;


}
