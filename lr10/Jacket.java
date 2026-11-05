package org.example;

public class Jacket implements Wearable, Washable {
    private String brand;
    private String size;
    private String material;

    public Jacket(String brand, String size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public void wear() {
        System.out.println("Куртка бренда " + this.brand + " (размер " + this.size + ") надета.");
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public void wash() {
        System.out.println("Куртка постирана в деликатном режиме для материала: " + this.material);
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}