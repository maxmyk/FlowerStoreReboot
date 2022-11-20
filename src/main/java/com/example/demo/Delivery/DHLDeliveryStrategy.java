package com.example.demo.Delivery;

import com.example.demo.Flower.store.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public List<Item> deliver(List<Item> items) {
        return items;
    }
}
