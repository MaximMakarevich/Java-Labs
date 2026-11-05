package org.example;

import java.util.Objects;

public class Game {
    private String title;
    private String genre;
    private int rating;
    private double price;
    private int releaseYear;
    private boolean inStock;

    public Game(String title, String genre, int rating, double price, int releaseYear) throws InvalidGameDataException {
        this.title = title;
        this.genre = genre;
        setRating(rating);
        setPrice(price);
        this.releaseYear = releaseYear;
        this.inStock = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) throws InvalidGameDataException {
        if (rating < 1 || rating > 10) {
            throw new InvalidGameDataException("Неверный рейтинг (" + rating + "). Рейтинг должен быть в диапазоне от 1 до 10.");
        }
        this.rating = rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) throws InvalidGameDataException {
        if (price < 0) {
            throw new InvalidGameDataException("Неверная цена (" + price + "). Цена не может быть отрицательной.");
        }
        this.price = price;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public boolean isInStock() {
        return this.inStock;
    }

    public void purchase() throws PurchaseException {
        if (!this.inStock) {
            throw new PurchaseException("Ошибка покупки: игра \"" + this.title + "\" уже распродана или недоступна!");
        }
        this.inStock = false;
        System.out.println("Игра \"" + this.title + "\" успешно приобретена за " + this.price + " руб.");
    }

    public void updatePrice(double newPrice) throws InvalidGameDataException {
        setPrice(newPrice);
        System.out.println("Цена на игру \"" + this.title + "\" обновлена: " + this.price + " руб.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        return this.releaseYear == game.releaseYear && Objects.equals(this.title, game.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.releaseYear);
    }

    @Override
    public String toString() {
        return "\"" + this.title + "\" (" + this.releaseYear + "), Жанр: " + this.genre + ", Рейтинг: " + this.rating + "/10, Цена: " + this.price + " руб., В наличии: " + (this.inStock ? "Да" : "Нет");
    }
}