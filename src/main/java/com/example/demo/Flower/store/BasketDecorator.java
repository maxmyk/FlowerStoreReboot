package com.example.demo.Flower.store;

public class BasketDecorator extends AbstractDecorator{
    @Override
    public String toString() {
        return super.toString();
    }
    public String getDescription() {
        return this.toString();
    }
    public double getPrice(){
        return 4.0;
    }
}
