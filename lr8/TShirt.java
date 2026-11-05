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

    public void setPrint(String print) {
        this.print = print;
    }

    @Override
    public String getSeason() {
        return "Весна/Лето";
    }

    public void iron() {
        System.out.println("Футболка поглажена (принт: " + this.print + ").");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Категория: Футболка, Принт: " + this.print);
    }
}