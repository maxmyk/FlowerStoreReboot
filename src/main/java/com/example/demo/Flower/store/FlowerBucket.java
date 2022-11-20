package com.example.demo.Flower.store;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::getPrice).sum();
    }

    @Override
    public String getDescription() {
        return null;
    }

    public boolean searchFlower(Flower flower){
        for (FlowerPack pack:this.packs) {
            if (pack.getFlower() == flower){
                return true;
            }
        }
        return false;
    }
    public ArrayList<FlowerPack> getPacks() {
        return packs;
    }
}
