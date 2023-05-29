package com.api.bechallenge.controllers;

import com.api.bechallenge.models.OrderProductModel;
import com.api.bechallenge.services.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/orderItem")
public class OrderProductController {

    @Autowired
    private OrderProductService orderProductService;

    @GetMapping
    public ArrayList<OrderProductModel> getOrderItems(){
        return this.orderProductService.getOrderItems();
    }

    @PostMapping
    public OrderProductModel saveOrderItem(@RequestBody OrderProductModel orderItem){
        return this.orderProductService.saveOrderItem(orderItem);
    }

}
