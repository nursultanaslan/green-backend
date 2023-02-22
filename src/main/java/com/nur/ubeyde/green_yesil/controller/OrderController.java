package com.nur.ubeyde.green_yesil.controller;

import com.nur.ubeyde.green_yesil.model.Order;
import com.nur.ubeyde.green_yesil.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping("all/{user_id}")
    public List<Order> all(@PathVariable("id") Integer id){
        return orderRepository.findAll();
    }

    @GetMapping("shipment/{order_id}") //???
    public String shipStatus(@PathVariable("order_id") Integer id){  //sipariş id
        Order requestedOrder = orderRepository.getById(id);   //id ile siparişi buluyoruz.
        return requestedOrder.getShippingStatus();            //buldugumuz siparişin kargo durumunu gönderiyoruz

    }
}
