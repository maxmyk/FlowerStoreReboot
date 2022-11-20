package com.example.demo.Delivery;

import com.example.demo.Flower.store.Item;

import java.util.List;

public interface Delivery {
    List<Item> deliver(List<Item> items);
}