import java.util.Scanner;

public class LR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задания:");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.println("Введите размер массива:");
                int size = scanner.nextInt();

                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите элемент массива с индексом " + i);
                    array[i] = scanner.nextInt();
                }

                if (array.length < 2) {
                    System.out.println("В массиве нет элементов на нечетных позициях.");
                } else {
                    int product = 1;
                    for (int i = 1; i < array.length; i += 2) {
                        product *= array[i];
                    }
                    System.out.println("Произведение элементов на нечетных позициях: " + product);
                }
                break;

            case 2:
                System.out.println("Введите размерность квадратной матрицы N:");
                int n = scanner.nextInt();

                int[][] matrix = new int[n][n];
                int max = 100;
                int min = -100;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.println("Введите элемент матрицы:" + '[' + i + ']' + '[' + j + ']');
                        // matrix[i][j] = scanner.nextInt();
                        matrix[i][j] = (int)(Math.random() * (max - min + 1)) + min;

                    }
                }

                int sum = 0;
                int count = 0;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i + j > matrix.length - 1) {
                            if (matrix[i][j] < 0) {
                                sum += matrix[i][j];
                                count++;
                            }
                        }
                    }
                }

                System.out.println("Количество отрицательных элементов под побочной диагональю: " + count);
                System.out.println("Сумма отрицательных элементов под побочной диагональю: " + sum);
                break;

            default:
                System.out.println("Ошибка: неверный номер задания.");
                break;
        }

        scanner.close();
    }
}