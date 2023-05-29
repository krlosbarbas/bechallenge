package com.api.bechallenge.services;

import static org.mockito.Mockito.verify;
import com.api.bechallenge.repositories.IOrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Mock private IOrderRepository orderRepository;
    private OrderService orderService;

    @BeforeEach void setUp(){
        this.orderService = new OrderService(this.orderRepository);
    }

    @Test void getById(){
        orderService.getById(1L);
        verify(orderRepository).findById(1L);
    }

}
