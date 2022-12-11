package com.example.demo.FlowerService;

import com.example.demo.Flower.store.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
//        return List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 23.0, 2.3), new Flower(FlowerType.ROSE));
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
