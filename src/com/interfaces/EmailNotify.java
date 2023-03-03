package com.interfaces;

public class EmailNotify implements NotifyService{
    @Override
    public void send(String message) {
        System.out.println("He notificado '" + message + "' por Email");
    }
}
