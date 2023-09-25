package com.codebase;

import java.util.ArrayList;

public class Dealership implements ICarOwner{
    private int till;
    private ArrayList<Car> ownedCars;

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public Dealership(int money, ArrayList<Car> ownedCars) {
        this.till = money;
        this.ownedCars = ownedCars;
    }

    public int getTill() {
        return till;
    }


    public Car sellToCustomer(Car car, Customer customer) {
        customer.buy(car);
        return sell(car);
    }

    @Override
    public Car sell(Car car) {
        this.till += car.getPrice();
        return this.ownedCars.remove(ownedCars.indexOf(car));
    }

    @Override
    public void buy(Car car) {
        this.till -= car.getPrice();
        this.ownedCars.add(car);
    }
    public void repair(Car car){
        this.till-=car.getDamage();
        car.changeDamage(car.getDamage());
    }

}
