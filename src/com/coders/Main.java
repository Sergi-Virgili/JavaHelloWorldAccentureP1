package com.coders;

import com.coders.models.Bootcamp;
import com.coders.models.Coder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var coder = new Coder(null,"Sergi");
        var bootcamp = new Bootcamp("P2","BCN");
        var bootcamp2 = new Bootcamp("P1","Mad");
        coder.addBootcamp(bootcamp);
        coder.setActualBootcamp(bootcamp2);
        System.out.println(coder.toString());
        List<Bootcamp> bootcampList = List.of(bootcamp,bootcamp2);
        for (Bootcamp item: bootcampList) {
            System.out.println(item);
        }
    }
}