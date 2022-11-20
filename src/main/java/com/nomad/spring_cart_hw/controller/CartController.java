package com.nomad.spring_cart_hw.controller;

import com.nomad.spring_cart_hw.model.Item;
import com.nomad.spring_cart_hw.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private final CartService cartService;
    public CartController (CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/order/get")
    public List<Item> getListOfOrder() {
        return this.cartService.getListOfOrder();
    }

    @GetMapping("/order/add")
    public List<Item> addItemToCart (@RequestParam("id") List <Integer> id) {
        return this.cartService.addItemToCart(id);
    }
}
