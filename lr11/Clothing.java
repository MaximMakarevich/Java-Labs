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

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public void wear() {
        System.out.println("Одеваю " + this.brand);
    }

    public void wear(String occasion) {
        System.out.println("Одеваю " + this.brand + " для " + occasion);
    }

    public void wear(int temperature) {
        System.out.println("Одеваю " + this.brand + " при " + temperature + "°C");
    }

    public String getSeason() {
        return "Всесезонная";
    }

    public void overloadMethod()
    {
        System.out.println("Метод для перегрузки");
    }

    public void displayInfo() {
        System.out.println("Бренд: " + this.brand + ", Размер: " + this.size + ", Цвет: " + this.color);
    }
}