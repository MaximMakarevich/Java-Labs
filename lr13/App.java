package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameStore store = new GameStore();

        try {
            store.addGame(new Game("Ведьмак 3", "RPG", 10, 80.0, 2015));
            store.addGame(new Game("Cyberpunk 2077", "Action", 8, 85.0, 2020));
            store.addGame(new Game("Minecraft", "Sandbox", 9, 35.0, 2011));
        } catch (InvalidGameDataException e) {
            System.out.println("Ошибка при начальном заполнении: " + e.getMessage());
        }

        store.printCatalog();

        System.out.println("\nИсключение InvalidGameDataException");
        try {
            System.out.println("Попытка создать игру с рейтингом 15 и ценой -100:");
            Game badGame = new Game("Сломанная игра", "Тест", 15, -100.0, 2024);
        } catch (InvalidGameDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        System.out.println("\nИсключение GameNotFoundException");
        try {
            System.out.println("Поиск игры 'GTA VI':");
            Game notFound = store.findGame("GTA VI");
        } catch (GameNotFoundException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        System.out.println("\nПокупка и PurchaseException");
        try {
            Game witcher = store.findGame("Ведьмак 3");
            System.out.println("Попытка первой покупки:");
            witcher.purchase();

            System.out.println("Попытка повторной покупки той же копии:");
            witcher.purchase();
        } catch (GameNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (PurchaseException e) {
            System.out.println("Перехвачено исключение покупки: " + e.getMessage());
        }

        System.out.println("\nВвидете данные:");
        try {
            System.out.println("Введите название игры из каталога для покупки:");
            String userChoice = scanner.nextLine();
            Game selectedGame = store.findGame(userChoice);
            selectedGame.purchase();
        } catch (GameNotFoundException | PurchaseException e) {
            System.out.println("Ошибка выполнения операции: " + e.getMessage());
        } finally {
            System.out.println("\nБлок finally: работа магазина завершена, ресурсы освобождены.");
        }

        scanner.close();
    }
}