package com.api.bechallenge.controllers;

import com.api.bechallenge.models.ProductModel;
import com.api.bechallenge.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ArrayList<ProductModel> getProducts(){
        return this.productService.getProducts();
    }

    @PostMapping
    public ProductModel saveProduct(@RequestBody ProductModel product){
        if (this.productService.getByProductName(product.getProductName())==null) {
            return this.productService.saveProduct(product);
        }else{
            return null;
        }
    }

    @GetMapping(path="/{id}")
    public Optional<ProductModel> getProductById(@PathVariable("id") Long id){
        return this.productService.getById(id);
    }

    @GetMapping(path="/{name}")
    public ProductModel getProductByName(@PathVariable("name") String productName){
        return this.productService.getByProductName(productName);
    }

    @PutMapping(path="/{id}")
    public ProductModel updateProductById(@RequestBody ProductModel request, @PathVariable("id") Long id){
        return this.productService.updateProductById(request, id);
    }

}
