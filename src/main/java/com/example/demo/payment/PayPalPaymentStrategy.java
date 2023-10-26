package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment successful");
    }
}
