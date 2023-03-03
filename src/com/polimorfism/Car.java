package com.polimorfism;

public class Car extends Vehicle{
    String type = "car";
    public Car(String color) {
        super(color);
    }

    @Override
    public void accelerate(Integer num) {
        this.velocity += num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
