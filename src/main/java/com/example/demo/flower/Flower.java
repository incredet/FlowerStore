package com.example.demo.flower;

import lombok.*;
@AllArgsConstructor @Getter @NoArgsConstructor @ToString
public class Flower extends Item{
    private FlowerColor color;
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
}
