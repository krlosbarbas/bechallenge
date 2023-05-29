package com.api.bechallenge.repositories;

import com.api.bechallenge.models.OrderProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderProductRepository  extends JpaRepository<OrderProductModel,Long> {
}
