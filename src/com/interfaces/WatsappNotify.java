package com.interfaces;

public class WatsappNotify implements NotifyService {
    @Override
    public void send(String message) {
        System.out.println("He notificado '" + message + "' por Wasapp");
    }
}
