package com.api.bechallenge.controllers;

import com.api.bechallenge.models.OrderModel;
import com.api.bechallenge.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ArrayList<OrderModel> getOrders(){
        return this.orderService.getOrders();
    }

    @PostMapping
    public OrderModel saveOrder(@RequestBody OrderModel order){
            return this.orderService.saveOrder(order);
    }

    @GetMapping(path="/{id}")
    public Optional<OrderModel> getOrderById(@PathVariable("id") Long id){
        return this.orderService.getById(id);
    }

}
