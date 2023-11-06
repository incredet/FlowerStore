package com.example.demo.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public void addFlower(Flower flower){
        System.out.println(flower);
        flowerRepository.save(flower);
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }
}
