package com.example.demo.Flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractDecoratorTest {

    @Test
    void checkIfEverythingWorks() {
        FlowerBucket fb = new FlowerBucket();
        fb.add(new FlowerPack(new Flower(1,10,1, FlowerColor.BLUE, FlowerType.ROMASHKA), 10));
        Item flower = fb;
        Assertions.assertEquals(100.0, flower.getPrice());
        flower = new ItemDiscount(flower);
        Assertions.assertEquals(80.0, flower.getPrice());
    }
}