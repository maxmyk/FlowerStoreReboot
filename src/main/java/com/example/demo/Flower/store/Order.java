package com.example.demo.Flower.store;

import com.example.demo.Delivery.Delivery;
import com.example.demo.Payment.Payment;
import com.example.demo.UserServices.UserService;
import com.example.demo.users.AppUser;

import java.util.LinkedList;
import java.util.List;

public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;

    UserService userService;
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double price = 0;
        for(Item item:this.items){
            price += item.getPrice();
        }
        price = this.payment.pay(price);
        return price;
    }
    public boolean processOrder(){
        return true;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void addUser(AppUser user){
        userService.addUser(user);
    }
    public void removeUser(AppUser user){

    }

    public void notifyUsers(List<AppUser> users){
        for (AppUser user:users) {
            user.notify();
        }
    }

    public void order(){
        notifyUsers(userService.getUsers());
    }
}
