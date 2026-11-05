package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание варианта 13 (1, 2, 3, 4 или 5):");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                System.out.println("Введите информацию о любимом виде спорта:");
                String sportInfo = scanner.nextLine();

                File sportFile = new File("sport_info.txt");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(sportFile))) {
                    writer.write(sportInfo);
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл: " + e.getMessage());
                }

                System.out.println("\nДанные о созданном файле:");
                System.out.println("Имя файла: " + sportFile.getName());
                System.out.println("Абсолютный путь: " + sportFile.getAbsolutePath());
                System.out.println("Размер: " + sportFile.length() + " байт");
                System.out.println("Существует: " + sportFile.exists());
                System.out.println("Доступен для чтения: " + sportFile.canRead());
                System.out.println("Доступен для записи: " + sportFile.canWrite());

                System.out.println("\nСодержимое файла:");
                try (BufferedReader reader = new BufferedReader(new FileReader(sportFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла: " + e.getMessage());
                }
                break;

            case "2":
                System.out.println("Введите 10 целых чисел:");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("f_task2.txt"))) {
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Число " + (i + 1) + ": ");
                        int num = Integer.parseInt(scanner.nextLine().trim());
                        writer.write(num + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                }

                int countDivisibleBy3 = 0;
                System.out.println("\nЧисла, считанные из файла:");
                try (Scanner fileScanner = new Scanner(new File("f_task2.txt"))) {
                    while (fileScanner.hasNextInt()) {
                        int num = fileScanner.nextInt();
                        System.out.print(num + " ");
                        if (num % 3 == 0) {
                            countDivisibleBy3++;
                        }
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                }

                System.out.println("Количество чисел, кратных 3: " + countDivisibleBy3);
                break;

            case "3":
                Random random = new Random();
                int totalRandomNumbers = 15;

                try (BufferedWriter writerF = new BufferedWriter(new FileWriter("f_task3.txt"))) {
                    for (int i = 0; i < totalRandomNumbers; i++) {
                        int val = random.nextInt(99) + 2;
                        writerF.write(val + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи файла f: " + e.getMessage());
                }

                try (Scanner fileScannerF = new Scanner(new File("f_task3.txt"));
                     BufferedWriter writerG = new BufferedWriter(new FileWriter("g.txt"));
                     BufferedWriter writerH = new BufferedWriter(new FileWriter("h.txt"))) {

                    System.out.println("Исходные случайные числа из файла f:");
                    while (fileScannerF.hasNextInt()) {
                        int val = fileScannerF.nextInt();
                        System.out.print(val + " ");
                        if (isPrime(val)) {
                            writerG.write(val + " ");
                        } else {
                            writerH.write(val + " ");
                        }
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка разделения файлов: " + e.getMessage());
                }

                System.out.println("\nПростые числа из файла g:");
                try (Scanner fileScannerG = new Scanner(new File("g.txt"))) {
                    while (fileScannerG.hasNextInt()) {
                        System.out.print(fileScannerG.nextInt() + " ");
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла g: " + e.getMessage());
                }

                System.out.println("Остальные числа из файла h:");
                try (Scanner fileScannerH = new Scanner(new File("h.txt"))) {
                    while (fileScannerH.hasNextInt()) {
                        System.out.print(fileScannerH.nextInt() + " ");
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла h: " + e.getMessage());
                }
                break;

            case "4":
                System.out.println("Введите 10 вещественных значений расстояния (в км):");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("distances.txt"))) {
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Расстояние " + (i + 1) + ": ");
                        double dist = Double.parseDouble(scanner.nextLine().trim());
                        writer.write(dist + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                }

                double totalDistance = 0.0;
                int distanceCount = 0;

                System.out.println("\nСчитанные значения расстояний:");
                try (Scanner fileScanner = new Scanner(new File("distances.txt"))) {
                    while (fileScanner.hasNextDouble()) {
                        double d = fileScanner.nextDouble();
                        System.out.print(d + " ");
                        totalDistance += d;
                        distanceCount++;
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                }

                if (distanceCount > 0) {
                    double avgDistance = totalDistance / distanceCount;
                    System.out.println("Среднее расстояние: " + avgDistance + " км");
                }
                break;

            case "5":
                System.out.println("Введите 10 целых чисел для записи в файл:");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("f_task5.txt"))) {
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Число " + (i + 1) + ": ");
                        int val = Integer.parseInt(scanner.nextLine().trim());
                        writer.write(val + " ");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка записи: " + e.getMessage());
                }

                int countMultiplesOf4 = 0;
                System.out.println("\nЧисла из файла:");
                try (Scanner fileScanner = new Scanner(new File("f_task5.txt"))) {
                    while (fileScanner.hasNextInt()) {
                        int val = fileScanner.nextInt();
                        System.out.print(val + " ");
                        if (val % 4 == 0) {
                            countMultiplesOf4++;
                        }
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("Ошибка чтения: " + e.getMessage());
                }

                System.out.println("Количество чисел, кратных 4: " + countMultiplesOf4);
                break;

            default:
                System.out.println("Неверный номер задания.");
                break;
        }

        scanner.close();
    }
}