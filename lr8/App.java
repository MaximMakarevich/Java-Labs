package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clothing[] items = new Clothing[5];

        System.out.println("Ввод данных:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Куртка " + (i + 1) + ":");
            System.out.println("Введите бренд:");
            String brand = scanner.nextLine();
            System.out.println("Введите размер:");
            String size = scanner.nextLine();
            System.out.println("Введите цвет:");
            String color = scanner.nextLine();
            System.out.println("Введите материал:");
            String material = scanner.nextLine();

            items[i] = new Jacket(brand, size, color, material);
        }

        System.out.println("\nВвод данных:");
        for (int i = 3; i < 5; i++) {
            System.out.println("Футболка " + (i - 2) + ":");
            System.out.println("Введите бренд:");
            String brand = scanner.nextLine();
            System.out.println("Введите размер:");
            String size = scanner.nextLine();
            System.out.println("Введите цвет:");
            String color = scanner.nextLine();
            System.out.println("Введите принт:");
            String print = scanner.nextLine();

            items[i] = new TShirt(brand, size, color, print);
        }

        System.out.println("\nРезультаты");
        for (int i = 0; i < items.length; i++) {
            System.out.println("\nЭлемент #" + (i + 1) + ":");
            items[i].displayInfo();

            if (items[i] instanceof Jacket) {
                Jacket jacket = (Jacket) items[i];
                jacket.zipUp();
            } else if (items[i] instanceof TShirt) {
                TShirt tshirt = (TShirt) items[i];
                tshirt.iron();
            }
        }

        scanner.close();
    }
}