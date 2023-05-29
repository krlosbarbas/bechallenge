package com.api.bechallenge.repositories;

import com.api.bechallenge.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IProductRepository extends JpaRepository<ProductModel,Long> {

    public ProductModel findByProductName(String productName);

    public ArrayList<ProductModel> findByProductUnitPriceGreaterThan(Float price);
}
