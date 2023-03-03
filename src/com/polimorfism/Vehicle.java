package com.polimorfism;

public abstract class Vehicle {
    protected String color;
    protected Integer velocity = 0;

    public Vehicle(String color) {
        this.color = color;
    }

    public abstract void accelerate(Integer num);

    public String getColor() {
        return color;
    }

    public Integer getVelocity() {
        return velocity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
