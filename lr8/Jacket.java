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

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "Осень/Зима";
    }

    public void zipUp() {
        System.out.println("Куртка застегнута на молнию (материал: " + this.material + ").");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Категория: Куртка, Материал: " + this.material);
    }
}