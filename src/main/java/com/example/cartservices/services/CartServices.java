package com.example.cartservices.services;


import com.example.cartservices.models.Cart;
import com.example.cartservices.models.Product;

import java.util.List;

public interface CartServices {
    public List<Cart> getAllCarts();
    public Cart getCart(Long id);
    public List<Cart> getLimitCart(Long limit);
    public Cart getCartInDateRange(String startDate , String endDate);
    public void getUserCarts(Long userId);
    public List<Cart> addNewCart(String categoryName);
    public List<Cart> updateAProduct(Long productId);
    public List<Cart> deleteCart(Long cartId);
    public List<Cart> getSortedProducts(String sort);
}