package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> games;

    public GameStore() {
        this.games = new ArrayList<Game>();
    }

    public void addGame(Game game) {
        this.games.add(game);
    }

    public Game findGame(String title) throws GameNotFoundException {
        for (int i = 0; i < this.games.size(); i++) {
            if (this.games.get(i).getTitle().equalsIgnoreCase(title)) {
                return this.games.get(i);
            }
        }
        throw new GameNotFoundException("Игра с названием \"" + title + "\" не найдена в магазине!");
    }

    public void printCatalog() {
        System.out.println("\n--- Каталог игр магазина ---");
        for (int i = 0; i < this.games.size(); i++) {
            System.out.println((i + 1) + ". " + this.games.get(i));
        }
    }
}