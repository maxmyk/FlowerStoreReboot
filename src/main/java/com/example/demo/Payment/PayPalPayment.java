package com.example.demo.Payment;

public class PayPalPayment implements Payment{
    @Override
    public double pay(double price) {
        return price+4.0;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
