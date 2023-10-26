package com.example.demo.payment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/payment")
public class PaymentController {
    @GetMapping("/cc")
    public String getPayment() {
        return "Credit card payment";
    }
    @GetMapping("/pp")
    public String getPayPal() {
        return "PayPal payment";
    }

}