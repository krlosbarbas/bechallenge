package com.api.bechallenge.repositories;

import com.api.bechallenge.models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrderRepository extends JpaRepository<OrderModel,Long>{

}
