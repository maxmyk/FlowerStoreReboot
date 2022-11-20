package com.example.demo.Payment;

public class CreditCardPayment implements Payment{
    @Override
    public double pay(double price) {
        return price+5.0;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
