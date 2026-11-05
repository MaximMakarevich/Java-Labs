package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите адрес здания:");
        String address = scanner.nextLine();

        System.out.println("Введите количество этажей:");
        int floors = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Введите общую площадь здания:");
        double totalArea = Double.parseDouble(scanner.nextLine().trim());

        Building building = new Building(address, floors, totalArea);

        System.out.println("Информация о здании:");
        System.out.println("Адрес: " + building.getAddress());
        System.out.println("Количество этажей: " + building.getFloors());
        System.out.println("Общая площадь: " + building.getTotalArea());
        System.out.println("Средняя площадь одного этажа: " + building.averageAreaPerFloor());

        scanner.close();
    }
}