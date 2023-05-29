package com.api.bechallenge.services;

import com.api.bechallenge.models.OrderProductModel;
import com.api.bechallenge.repositories.IOrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class OrderProductService {

    @Autowired
    IOrderProductRepository orderProductRepository;


    public ArrayList<OrderProductModel> getOrderItems(){
        try {
            return (ArrayList<OrderProductModel>) orderProductRepository.findAll();
        }catch(Exception e){
            System.out.println("**********" + e.getMessage());
        }
        return null;
    }

    public OrderProductModel saveOrderItem(@RequestBody OrderProductModel orderItem){

        return orderProductRepository.save(orderItem);
    }

}
