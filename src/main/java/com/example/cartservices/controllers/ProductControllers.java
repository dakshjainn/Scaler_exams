package com.example.cartservices.controllers;

import com.example.cartservices.models.Product;
import com.example.cartservices.services.FakeStoreProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    FakeStoreProductServices fakeStoreProductServices = new FakeStoreProductServices();
    @GetMapping("/")
    public String getProductName() {
        return "Enter Product Id to get Details of Product";
    }

    @GetMapping("/product/{id}")
    public Product getProductDetails(@PathVariable Long id) {
        return fakeStoreProductServices.getProduct(id);
    }
}