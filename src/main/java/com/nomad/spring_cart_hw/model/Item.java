package com.nomad.spring_cart_hw.model;

public class Item {

    private int id;

    public Item(int id) {

        this.id=id;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }
}
