package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer[] computers = new Computer[5];

        System.out.println("Ввод данных:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Игровой ПК " + (i + 1) + ":");
            System.out.println("Введите процессор:");
            String proc = scanner.nextLine();
            System.out.println("Введите объем ОЗУ (ГБ):");
            int ram = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Введите объем накопителя (ГБ):");
            int storage = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Введите видеокарту:");
            String gpu = scanner.nextLine();

            computers[i] = new GamingPC(proc, ram, storage, gpu);
        }

        System.out.println("\nВвод данных:");
        for (int i = 2; i < 5; i++) {
            System.out.println("Офисный ПК " + (i - 1) + ":");
            System.out.println("Введите процессор:");
            String proc = scanner.nextLine();
            System.out.println("Введите объем ОЗУ (ГБ):");
            int ram = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Введите объем накопителя (ГБ):");
            int storage = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Введите диагональ монитора (дюймы, например 23.8):");
            double monitor = Double.parseDouble(scanner.nextLine().trim());

            computers[i] = new OfficePC(proc, ram, storage, monitor);
        }

        System.out.println("\n--- Результаты и полиморфный вызов методов ---");
        for (int i = 0; i < computers.length; i++) {
            System.out.println("\nКомпьютер #" + (i + 1) + ":");
            computers[i].displayInfo();
            System.out.println("Производительность: " + computers[i].getPerformance());
            System.out.println("Назначение: " + computers[i].getPurpose());
        }

        scanner.close();
    }
}