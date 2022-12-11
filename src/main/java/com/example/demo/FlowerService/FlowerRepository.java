package com.example.demo.FlowerService;

import com.example.demo.Flower.store.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
