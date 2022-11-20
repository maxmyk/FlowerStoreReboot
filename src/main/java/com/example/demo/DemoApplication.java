package com.example.demo;

import com.example.demo.Flower.store.Flower;
import com.example.demo.Flower.store.FlowerBucket;
import com.example.demo.Flower.store.FlowerType;
import com.example.demo.Flower.store.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@GetMapping
//	public String hello(){
//		Item item = new FlowerBucket();
//
//		return new Flower(FlowerType.CHAMOMILE, 19.6, 2).toString();
//	}
}
