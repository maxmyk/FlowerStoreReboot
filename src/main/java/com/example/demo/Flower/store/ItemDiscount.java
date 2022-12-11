package com.example.demo.Flower.store;

public class ItemDiscount extends Item{
    private final Item item;
    public ItemDiscount(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return item.getPrice() * 0.8;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
