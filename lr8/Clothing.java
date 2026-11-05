package org.example;

public class Clothing {
    private String brand;
    private String size;
    private String color;

    public Clothing(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return "Всесезонная";
    }

    public void displayInfo() {
        System.out.println("Бренд: " + this.brand + ", Размер: " + this.size + ", Цвет: " + this.color + ", Сезон: " + getSeason());
    }
}