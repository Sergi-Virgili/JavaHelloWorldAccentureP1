package com.interfaces;

public class UserService {

    private final NotifyService notifyService = new EmailNotify();


    private String notification;

    //    public UserService(NotifyService notifyService) {
//        this.notifyService = notifyService;
//    }

    public UserService() {
    }

    public UserService(String notification) {
        this.notification = notification;
    }

    public void save(User user) {
        System.out.println("el usuario se ha creado");
        if (this.notification == "email") {
            var email = new EmailNotify();
            email.send("su usuario ha seido creado");
        }
        if (this.notification == "whatsapp") {
            var wp = new WatsappNotify();
            wp.send("su usuario ha seido creado");
        }
//        notifyService.send("su usuario ha seido creado");
    }
}
