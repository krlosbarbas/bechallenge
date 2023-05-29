package com.api.bechallenge.services;

import com.api.bechallenge.models.OrderModel;
import com.api.bechallenge.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    public OrderService(IOrderRepository orderRepository) {
    }

    public ArrayList<OrderModel> getOrders(){
        try {
            return (ArrayList<OrderModel>) orderRepository.findAll();
        }catch(Exception e){
            System.out.println("**********" + e.getMessage());
        }
        return null;
    }

    public OrderModel saveOrder(OrderModel order){
        return orderRepository.save(order);
    }

    public Optional<OrderModel> getById(Long id){
        return orderRepository.findById(id);
    }

}
