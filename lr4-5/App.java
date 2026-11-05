package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Максим!" );
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                System.out.println("Введите пункт назначения поезда:");
                String dest = scanner.nextLine();
                System.out.println("Введите номер поезда:");
                String number = scanner.nextLine();
                System.out.println("Введите время отправления:");
                String time = scanner.nextLine();

                Train train = new Train(dest, number, time);
                System.out.println("Исходное расписание:");
                train.displayInfo();

                System.out.println("Введите количество минут задержки:");
                int delay = Integer.parseInt(scanner.nextLine().trim());
                train.isDelayed(delay);

                System.out.println("Обновленное расписание после задержки:");
                train.displayInfo();
                break;

            case "2":
                Athlete[] athletes = new Athlete[5];
                for (int i = 0; i < athletes.length; i++) {
                    System.out.println("Спортсмен №" + (i + 1) + ":");
                    System.out.println("Введите имя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите вид спорта:");
                    String sport = scanner.nextLine();
                    System.out.println("Введите результат:");
                    double score = Double.parseDouble(scanner.nextLine().trim());
                    athletes[i] = new Athlete(name, sport, score);
                }

                Athlete bestAthlete = athletes[0];
                double totalScore = 0.0;

                for (int i = 0; i < athletes.length; i++) {
                    totalScore += athletes[i].getScore();
                    if (athletes[i].getScore() > bestAthlete.getScore()) {
                        bestAthlete = athletes[i];
                    }
                }

                double avgScore = totalScore / athletes.length;

                System.out.println("Спортсмен с максимальным результатом: " + bestAthlete.getName() + " (" + bestAthlete.getSport() + ") - " + bestAthlete.getScore() + " баллов");
                System.out.println("Средний результат всех спортсменов: " + avgScore);
                break;

            case "3":
                Product[] products = new Product[6];
                products[0] = new Product("Хлеб", Category.FOOD);
                products[1] = new Product("Куртка", Category.CLOTHES);
                products[2] = new Product("Смартфон", Category.ELECTRONICS);
                products[3] = new Product("Ноутбук", Category.ELECTRONICS);
                products[4] = new Product("Учебник Java", Category.BOOKS);
                products[5] = new Product("Конструктор", Category.TOYS);

                System.out.println("Все товары категории ELECTRONICS:");
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getCategory() == Category.ELECTRONICS) {
                        System.out.println("- " + products[i].getName());
                    }
                }
                for (int i = 0; i < products.length; i++) {
                    System.out.println(products[i]);
                }
                break;

            default:
                System.out.println("Неверный номер задания.");
                break;
        }

        scanner.close();
    }
}

