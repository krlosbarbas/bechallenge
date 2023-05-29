package com.api.bechallenge.services;

import com.api.bechallenge.models.ProductModel;
import com.api.bechallenge.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    IProductRepository productRepository;

    public ArrayList<ProductModel> getProducts(){
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    public ProductModel getByProductName(String productName){
        return productRepository.findByProductName(productName);
    }

    public ProductModel saveProduct(ProductModel product){
        return productRepository.save(product);
    }

    public Optional<ProductModel> getById(Long id){
        return productRepository.findById(id);
    }

    public ProductModel updateProductById(ProductModel request, Long id) {
        ProductModel product = productRepository.findById(id).get();
        product.setProductName(request.getProductName());
        product.setProductUnitPrice(request.getProductUnitPrice());
        return product;
    }
}
