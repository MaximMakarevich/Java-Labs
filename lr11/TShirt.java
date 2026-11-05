package org.example;

public class TShirt extends Clothing {
    private String print;

    public TShirt(String brand, String size, String color, String print) {
        super(brand, size, color);
        this.print = print;
    }

    public String getPrint() {
        return this.print;
    }

    @Override
    public String getSeason() {
        return "Лето";
    }

    public void wear(String occasion, int temperature) {
        System.out.println("Одеваю футболку " + getBrand() + " с принтом \"" + this.print + "\" для " + occasion + " при " + temperature + "°C");
    }
}