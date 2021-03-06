package com.company.devices;

import com.company.animals.Human;

public abstract class Car extends Device {

    public Double engineSize;
    public String fuelType;

    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.car = this;
            seller.car = null;
            System.out.println("Car has been sold");
            return true;
        } else {
            System.out.println("Buyer does not have enough money");
        }
        return false;
    }
    public abstract void refuel();
}
