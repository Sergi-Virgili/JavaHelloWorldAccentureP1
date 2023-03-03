package com.interfaces;



public class Main {

    public static void main(String[] args) {
        User user = new User();
        var userService = new UserService("whatsapp");
        //Muy mal, vamos a usar polimorfismo, invertir la dependencia y cumplir Open/Close
        userService.save(user);
    }

}
