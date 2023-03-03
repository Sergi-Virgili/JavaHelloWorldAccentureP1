package com.polimorfism;

public class Moto extends Vehicle {
    String type="moto";
    public Moto(String color) {
        super(color);
    }

    @Override
    public void accelerate(Integer num) {
        this.velocity += num*2;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
