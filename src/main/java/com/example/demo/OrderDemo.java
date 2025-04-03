package com.example.demo;

import org.springframework.stereotype.Service;

//using constructor based DI
@Service
public class OrderDemo {
    PaymentService paymentService;

    OrderDemo(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void placeOrder(double amt) {
        paymentService.processPayment(amt);
    }
}
