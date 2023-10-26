package com.example.demo.order;

import com.example.demo.delivery.Delivery;
import com.example.demo.flower.Item;
import com.example.demo.payment.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Order {
    @Getter
    private Payment payment;
    private Delivery delivery;
    private List<Item> items = new ArrayList<>();

    public void setDeliveryStrategy(Delivery deliveryMeth) {
        this.delivery = deliveryMeth;
    }
    public void setPaymentStrategy(Payment paymentMeth) {
        this.payment = paymentMeth;
    }
    public boolean isFinished = false;

    public void processOrder(){
        if (items.isEmpty()) {
            System.out.println("Your card is empty(");
            return;
        }
        isFinished = true;
        System.out.println("Processing...");
        double price = calculateTotalPrice();
        payment.pay(price);
        delivery.deliver(items);
        System.out.printf("Price: " + price);
        System.out.println("Success!");
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (Item item:this.items){
            price += item.getPrice();
        }
        return price;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

}
