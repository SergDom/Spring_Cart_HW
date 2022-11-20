package com.nomad.spring_cart_hw.service;


import com.nomad.spring_cart_hw.model.Item;
import com.nomad.spring_cart_hw.repository.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private final Cart cart;

    public CartService(Cart cart) {

        this.cart = cart;
    }

    public List<Item> getListOfOrder() {

        return this.cart.getListOfOrder();
    }

    public List<Item> addItemToCart(List<Integer> id) {

        List<Item> list = new ArrayList<>();
        for (Integer integer : id) {
            Item item = new Item(integer);
            this.cart.addItemToCart(item);
            list.add(item);
        }
        return list;
    }
}
