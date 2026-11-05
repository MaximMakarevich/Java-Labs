import java.util.Scanner;

public class LR1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задания:");
        int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1:
                System.out.println("Введите первую строку:");
                String s1 = scanner.nextLine();
                System.out.println("Введите вторую строку:");
                String s2 = scanner.nextLine();
                System.out.println("Введите третью строку:");
                String s3 = scanner.nextLine();

                System.out.println("Строки в обратном порядке:");
                System.out.println(s3);
                System.out.println(s2);
                System.out.println(s1);
                break;

            case 2:
                System.out.println("Введите число:");
                double number = scanner.nextDouble();

                if (number >= -10 && number <= 10) {
                    System.out.println("Число " + number + " принадлежит диапазону [-10; 10].");
                }
                else {
                    System.out.println("Число " + number + " не принадлежит диапазону [-10; 10].");
                }
                break;

            case 3:
                System.out.println("Введите размер стороны квадрата N:");
                int n = scanner.nextInt();

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Ошибка: неверный номер задания.");
                break;
            }

        scanner.close();
        }
    }
