import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %10s%n", "Фамилия", "Зарплата");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s |%10.2f%n", employees[i].fullname, employees[i].salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задания:");
        int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1:
                System.out.println("Введите строку:");
                String str1 = scanner.nextLine();

                if (str1.endsWith(".txt")) {
                    System.out.println("Строка заканчивается на .txt");
                } else {
                    System.out.println("Строка не заканчивается на .txt");
                }
                break;

            case 2:
                System.out.println("Введите ФИО полностью:");
                String fio = scanner.nextLine();
                String[] parts = fio.trim().split("\\s+");

                if (parts.length >= 3) {
                    String result = parts[0] + " " + parts[1].charAt(0) + ". " + parts[2].charAt(0) + ".";
                    System.out.println("Результат: " + result);
                } else if (parts.length == 2) {
                    String result = parts[0] + " " + parts[1].charAt(0) + ".";
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Нет корректных данных");
                }
                break;

            case 3:
                System.out.println("Введите количество сотрудников:");
                int count = scanner.nextInt();
                scanner.nextLine();

                Employee[] employees = new Employee[count];
                for (int i = 0; i < employees.length; i++) {
                    System.out.println("Введите фамилию сотрудника " + (i + 1) + ":");
                    String name = scanner.nextLine();
                    System.out.println("Введите зарплату сотрудника " + (i + 1) + ":");
                    double sal = scanner.nextDouble();
                    scanner.nextLine();
                    employees[i] = new Employee(name, sal);
                }

                System.out.println("Отчет по зарплатам:");
                Report.generateReport(employees);
                break;

            case 4:

                String text = "aADa aBa aCa aDa aEa";

                System.out.println("Исходная строка:" + text);
                Pattern pattern = Pattern.compile("\\ba[A-D]{1,2}a\\b");
                Matcher matcher = pattern.matcher(text);

                System.out.println("Найденные подстроки:");
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;

            default:
                System.out.println("Неверный номер");
                break;
        }

        scanner.close();
    }
}