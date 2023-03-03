package com.polimorfism;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        Moto moto = new Moto("green");

        List<Vehicle> vehicleList = new ArrayList<>(List.of(car1, moto, car2));
        for (Vehicle vehicle:vehicleList) {
            vehicle.accelerate(2);
            System.out.println(vehicle);
        }
        var vehi = vehicleList.remove(1);
        vehicleList.forEach(x-> {
            x.accelerate(1);
            System.out.println(x);
        });

    }
}
