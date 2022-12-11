package com.example.demo;

import com.example.demo.Flower.store.*;

public class Main {
    public static void main(String[] args) {
        FlowerBucket fb = new FlowerBucket();
        fb.add(new FlowerPack(new Flower(1,10,1, FlowerColor.BLUE, FlowerType.ROMASHKA), 10));
        Item flower = fb;
        System.out.println(flower.getPrice());
        flower = new ItemDiscount(flower);
        System.out.println(flower.getPrice());
    }
}
