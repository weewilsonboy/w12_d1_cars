package com.codebase;

public class Car {
    private Type engine;
    private Tyres tyres;
    private int price;
    private String colour;
    private int damage;

    public Car(Type engine, Tyres tyres, int price, String colour, int damage) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public Type getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price -= damage;
    }

    public String getColour() {
        return colour;
    }

    public int getDamage() {
        return damage;
    }

    public void changeDamage(int damageNum) {
        this.damage += damageNum;
    }
}
