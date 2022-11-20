package com.example.demo.Controllers;

import com.example.demo.Flower.store.Flower;
import com.example.demo.Flower.store.FlowerColor;
import com.example.demo.Flower.store.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 23.0, 2.3), new Flower(FlowerType.ROSE));
    }
}