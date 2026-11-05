package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void printCafes(List<Cafe> cafes, int rating) {
        System.out.println("Кафе с рейтингом " + rating + ":");
        for (int i = 0; i < cafes.size(); i++) {
            if (cafes.get(i).getRating() == rating) {
                System.out.println(cafes.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                Map<String, Plant> plantMap = new LinkedHashMap<String, Plant>();

                plantMap.put("Дуб", new Tree("Дуб", 1, 15.0, 8.5));
                plantMap.put("Береза", new Tree("Береза", 2, 12.0, 4.0));
                plantMap.put("Сосна", new Tree("Сосна", 3, 20.0, 5.0));

                plantMap.put("Роза", new Flower("Роза", 4, 0.8, "Красный"));
                plantMap.put("Тюльпан", new Flower("Тюльпан", 5, 0.4, "Желтый"));
                plantMap.put("Ромашка", new Flower("Ромашка", 6, 0.3, "Белый"));

                plantMap.put("Сирень", new Shrub("Сирень", 7, 2.5, 30));
                plantMap.put("Малина", new Shrub("Малина", 8, 1.5, 15));

                System.out.println("Содержимое карты растений (Map<String, Plant>):");
                for (Map.Entry<String, Plant> entry : plantMap.entrySet()) {
                    System.out.println("Ключ: " + entry.getKey() + " | Значение: " + entry.getValue());
                }
                break;

            case "2":
                List<Cafe> cafes = new ArrayList<Cafe>();
                cafes.add(new Cafe(101, "Уют", "Центр", 3, Arrays.asList(5, 5, 5, 4)));
                cafes.add(new Cafe(102, "Бриз", "Набережная", 2, Arrays.asList(2, 2, 3, 1)));
                cafes.add(new Cafe(103, "Аврора", "Север", 4, Arrays.asList(5, 5, 5, 4)));
                cafes.add(new Cafe(104, "Кофеин", "Юг", 3, Arrays.asList(2, 1, 2, 3)));
                cafes.add(new Cafe(105, "Мечта", "Восток", 4, Arrays.asList(4, 4, 4, 4)));

                System.out.println("Исходный список кафе:");
                for (int i = 0; i < cafes.size(); i++) {
                    System.out.println(cafes.get(i));
                }

                Iterator<Cafe> iterator = cafes.iterator();
                while (iterator.hasNext()) {
                    Cafe cafe = iterator.next();
                    if (cafe.getAverageReview() < 3.0) {
                        iterator.remove();
                    }
                }

                System.out.println("\nПосле удаления кафе со средним рейтингом < 3:");
                for (int i = 0; i < cafes.size(); i++) {
                    System.out.println(cafes.get(i));
                }

                for (int i = 0; i < cafes.size(); i++) {
                    if (cafes.get(i).getAverageReview() >= 4.0) {
                        cafes.get(i).setRating(cafes.get(i).getRating() + 1);
                    }
                }

                System.out.println("\nПосле повышения рейтинга кафе с оценкой >= 4:");
                for (int i = 0; i < cafes.size(); i++) {
                    System.out.println(cafes.get(i));
                }

                System.out.println();
                printCafes(cafes, 5);

                Collections.sort(cafes, new Comparator<Cafe>() {
                    @Override
                    public int compare(Cafe c2, Cafe c1) {
                        int reviewCompare = Double.compare(c2.getAverageReview(), c1.getAverageReview());
                        if (reviewCompare != 0) {
                            return reviewCompare;
                        }
                        return c1.getName().compareTo(c2.getName());
                    }
                });

                System.out.println("\nУпорядоченный список:");
                for (int i = 0; i < cafes.size(); i++) {
                    Cafe c = cafes.get(i);
                    System.out.println("ID: " + c.getId() + ", Название: " + c.getName() + ", Средний рейтинг: " + String.format("%.2f", c.getAverageReview()));
                }
                break;

            default:
                System.out.println("Неверный номер задания.");
                break;
        }

        scanner.close();
    }
}