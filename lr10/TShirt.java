package org.example;

public class TShirt implements Wearable, Washable {
    private String brand;
    private String size;
    private String color;

    public TShirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void wear() {
        System.out.println("Футболка " + this.color + " цвета бренда " + this.brand + " надета.");
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public void wash() {
        System.out.println("Футболка постирана при температуре 40 градусов.");
    }

    @Override
    public String getMaterial() {
        return "Хлопок";
    }
}