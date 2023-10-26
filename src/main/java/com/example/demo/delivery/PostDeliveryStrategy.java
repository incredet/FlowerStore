package com.example.demo.delivery;
import com.example.demo.flower.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        System.out.println("Delivering...");
        return items.toString();
    }
}
