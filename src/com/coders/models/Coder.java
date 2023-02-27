package com.coders.models;

import java.util.*;

public class Coder {
    private UUID id;
    private String name;

    private Bootcamp actualBootcamp;

    private Set<Bootcamp> bootcampList = new HashSet<>();

    public Coder(UUID id, String name) {
        if (id == null) {
            id = UUID.randomUUID();
        }
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bootcamp getActualBootcamp() {
        return actualBootcamp;
    }

    public void setActualBootcamp(Bootcamp actualBootcamp) {
        this.actualBootcamp = actualBootcamp;
        this.addBootcamp(actualBootcamp);
    }

    public List<Bootcamp> getBootcampList() {
        return bootcampList.stream().toList();
    }

    public void addBootcamp(Bootcamp bootcamp) {
        this.bootcampList.add(bootcamp);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actualBootcamp=" + actualBootcamp +
                ", bootcampList=" + bootcampList +
                '}';
    }
}
