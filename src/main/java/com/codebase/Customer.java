package com.codebase;

import java.util.ArrayList;

public class Customer implements ICarOwner{
    private int money;
    private ArrayList<Car> ownedCars;

    public Customer(int money, ArrayList<Car> ownedCars) {
        this.money = money;
        this.ownedCars = ownedCars;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    @Override
    public Car sell(Car car) {
        this.money += car.getPrice();
        return this.ownedCars.remove(ownedCars.indexOf(car));
    }

    @Override
    public void buy(Car car) {
        this.money -= car.getPrice();
        this.ownedCars.add(car);
    }
}
