package com.example.demo;

import com.example.demo.Delivery.Delivery;
import com.example.demo.Delivery.PostDeliveryStrategy;
import com.example.demo.Flower.store.*;
import com.example.demo.Payment.PayPalPayment;
import com.example.demo.Payment.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class OrderTest {
    private Order order;

    @BeforeEach
    public void init() {
        order = new Order();
    }

    @Test
    void setPaymentStrategy() {
        Payment payment = new PayPalPayment();
        order.setPaymentStrategy(payment);
        Assertions.assertEquals(payment, order.getPayment());
    }

    @Test
    void setDeliveryStrategy() {
        Delivery delivery = new PostDeliveryStrategy();
        order.setDeliveryStrategy(delivery);
        Assertions.assertEquals(delivery, order.getDelivery());
    }

    @Test
    void calculateTotalPrice() {
        Flower flower1 = new Flower(FlowerType.CACTUS, FlowerColor.GREEN, 10.0, 12.0);
        Flower flower2 = new Flower(FlowerType.ROMASHKA, FlowerColor.WHITE, 8.0, 12.0);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack pack_rose = new FlowerPack(flower1,15);
        FlowerPack pack_roma = new FlowerPack(flower2,14);
        bucket.add(pack_roma);
        bucket.add(pack_rose);
        order.addItem(bucket);
        Delivery delivery = new PostDeliveryStrategy();
        order.setDeliveryStrategy(delivery);
        Payment payment = new PayPalPayment();
        order.setPaymentStrategy(payment);
        double pre = order.calculateTotalPrice();
        Assertions.assertEquals(pre, 266.0);
    }

    @Test
    void processOrder() {
    }

    @Test
    void addItem() {
        Flower flower1 = new Flower(FlowerType.ROSE);
        Flower flower2 = new Flower(FlowerType.ROMASHKA);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack pack_rose = new FlowerPack(flower1,15);
        FlowerPack pack_roma = new FlowerPack(flower2,14);
        bucket.add(pack_roma);
        bucket.add(pack_rose);
        order.addItem(bucket);
        LinkedList<Item> olst = order.getItems();
        Assertions.assertEquals(bucket, olst.getFirst());
    }

    @Test
    void removeItem() {
        Flower flower1 = new Flower(FlowerType.ROSE);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack pack_rose = new FlowerPack(flower1,15);
        bucket.add(pack_rose);
        order.addItem(bucket);
        LinkedList<Item> olst = order.getItems();
        Assertions.assertEquals(bucket, olst.getFirst());
        order.removeItem(olst.getFirst());
        Assertions.assertEquals(order.getItems().size(), 0);
    }
}