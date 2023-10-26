package com.example.demo.flower;

import java.util.ArrayList;
import java.util.List;
public class FlowerBucket {
    private int quantity;
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack:flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerpack) {
        this.flowerPacks.add(flowerpack);
    }
}