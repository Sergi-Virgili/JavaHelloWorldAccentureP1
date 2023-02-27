package com.coders.models;

import java.util.UUID;

public class Bootcamp {
    private UUID id;
    private String name;
    private String location;

    public Bootcamp(String name, String location) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
    }

    public Bootcamp(UUID id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
