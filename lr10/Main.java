package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jacket j1 = new Jacket("Белорусский трикотаж", "XL", "Хлопок 100%");
        j1.wear2();

        Jacket[] jackets = new Jacket[3];
        TShirt[] tshirts = new TShirt[2];

        System.out.println("Ввод данных:");
        for (int i = 0; i < jackets.length; i++) {
            System.out.println("Куртка " + (i + 1) + ":");
            System.out.println("Введите бренд:");
            String brand = scanner.nextLine();
            System.out.println("Введите размер:");
            String size = scanner.nextLine();
            System.out.println("Введите материал:");
            String material = scanner.nextLine();

            jackets[i] = new Jacket(brand, size, material);
        }

        System.out.println("\nВвод данных:");
        for (int i = 0; i < tshirts.length; i++) {
            System.out.println("Футболка " + (i + 1) + ":");
            System.out.println("Введите бренд:");
            String brand = scanner.nextLine();
            System.out.println("Введите размер:");
            String size = scanner.nextLine();
            System.out.println("Введите цвет:");
            String color = scanner.nextLine();

            tshirts[i] = new TShirt(brand, size, color);
        }

        System.out.println("\nВывод");
        for (int i = 0; i < jackets.length; i++) {
            jackets[i].wear();
        }
        for (int i = 0; i < tshirts.length; i++) {
            tshirts[i].wear();
        }

        System.out.println("\nВывод");
        for (int i = 0; i < jackets.length; i++) {
            jackets[i].wash();
        }
        for (int i = 0; i < tshirts.length; i++) {
            tshirts[i].wash();
        }

        scanner.close();
    }
}