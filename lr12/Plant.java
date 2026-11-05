package org.example;

public class Plant {
    private String name;
    private int id;
    private double height;

    public Plant(String name, int id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getHeight() {
        return this.height;
    }

    public String toString() {
        return "ID: " + this.id + ", Название: " + this.name + ", Высота: " + this.height + " м";
    }
}