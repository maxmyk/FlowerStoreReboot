package com.example.demo.Controllers;

import com.example.demo.Flower.store.Flower;
import com.example.demo.FlowerService.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/flowers")
public class FlowerController {
    private final FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower){
        flowerService.addFlower(flower);
    }
}