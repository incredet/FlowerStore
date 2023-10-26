package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment successful");
    }
}
