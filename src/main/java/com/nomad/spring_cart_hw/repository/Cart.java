package com.nomad.spring_cart_hw.repository;

import com.nomad.spring_cart_hw.model.Item;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Cart {
    private final List<Item> order = new ArrayList<>();

    public List<Item> getListOfOrder() {
        return this.order;
    }
    public void addItemToCart(Item item) {
        this.order.add(item);
    }
}
