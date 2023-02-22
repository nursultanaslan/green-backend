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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float productPrice;
    private Float shippingCost;
    private LocalDate orderDate;
    private String shippingStatus;

    private Integer user_id;
    private Integer product_id;
}
