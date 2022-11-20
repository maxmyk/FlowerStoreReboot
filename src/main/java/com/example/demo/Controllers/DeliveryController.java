package com.example.demo.Controllers;

import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Delivery.PostDeliveryStrategy;
import com.example.demo.Flower.store.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/deliveries")
public class DeliveryController {
    @GetMapping
    public List<List<Item>> getDeliveries() {
        return List.of(new PostDeliveryStrategy().deliver(new ArrayList<>()), new DHLDeliveryStrategy().deliver(new ArrayList<>()));
    }
}