package org.example;

public class Jacket extends Clothing {
    private String material;

    public Jacket(String brand, String size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public String getSeason() {
        return "Зима";
    }

    public void wear(boolean withHood) {
        if (withHood) {
            System.out.println("Одеваю куртку " + getBrand() + " с капюшоном");
        } else {
            System.out.println("Одеваю куртку " + getBrand() + " без капюшона");
        }
    }
}