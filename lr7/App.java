package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        City[] cities = new City[4];

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Введите данные для города " + (i + 1) + ":");

            System.out.println("Название города:");
            String name = scanner.nextLine();

            System.out.println("Страна:");
            String country = scanner.nextLine();

            System.out.println("Население:");
            int population = Integer.parseInt(scanner.nextLine().trim());

            cities[i] = new City(name, country, population);
        }

        System.out.println("Список созданных городов:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i].getName() + " (" + cities[i].getCountry() + ") - " + cities[i].getPopulation() + " чел.");
        }

        System.out.println("Всего городов: " + City.getTotalCities());
        System.out.println("Общее население: " + City.getTotalPopulation());
        System.out.println("Среднее население города: " + City.getAveragePopulation());

        scanner.close();
    }
}