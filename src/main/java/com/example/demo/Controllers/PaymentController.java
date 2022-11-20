package com.example.demo.Controllers;

import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Delivery.PostDeliveryStrategy;
import com.example.demo.Flower.store.Item;
import com.example.demo.Payment.CreditCardPayment;
import com.example.demo.Payment.PayPalPayment;
import com.example.demo.Payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/payments")
public class PaymentController {
    @GetMapping
    public static List<Double> getPayments() {
        return List.of(new CreditCardPayment().pay(12), new PayPalPayment().pay(132));
    }
}