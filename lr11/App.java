package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввод данных:");
        System.out.println("Введите бренд:");
        String jBrand = scanner.nextLine();
        System.out.println("Введите размер:");
        String jSize = scanner.nextLine();
        System.out.println("Введите цвет:");
        String jColor = scanner.nextLine();
        System.out.println("Введите материал:");
        String jMaterial = scanner.nextLine();

        Jacket jacket = new Jacket(jBrand, jSize, jColor, jMaterial);

        System.out.println("\nВвод данных:");
        System.out.println("Введите бренд:");
        String tBrand = scanner.nextLine();
        System.out.println("Введите размер:");
        String tSize = scanner.nextLine();
        System.out.println("Введите цвет:");
        String tColor = scanner.nextLine();
        System.out.println("Введите принт:");
        String tPrint = scanner.nextLine();

        TShirt tshirt = new TShirt(tBrand, tSize, tColor, tPrint);

        System.out.println("\nПерегрузка");
        jacket.wear();
        jacket.wear("прогулки");
        jacket.wear(-5);
        jacket.wear(true);

        System.out.println();
        tshirt.wear();
        tshirt.wear("тренировки");
        tshirt.wear(25);
        tshirt.wear("пляжа", 28);

        System.out.println("\nПереопредление");
        Clothing[] wardrobe = new Clothing[2];
        wardrobe[0] = jacket;
        wardrobe[1] = tshirt;

        for (int i = 0; i < wardrobe.length; i++) {
            System.out.print("Элемент #" + (i + 1) + " -> ");
            wardrobe[i].displayInfo();
            System.out.println("Сезон: " + wardrobe[i].getSeason());

            if (wardrobe[i] instanceof Jacket) {
                Jacket j = (Jacket) wardrobe[i];
                System.out.println("Материал куртки: " + j.getMaterial());
            } else if (wardrobe[i] instanceof TShirt) {
                TShirt t = (TShirt) wardrobe[i];
                System.out.println("Принт футболки: " + t.getPrint());
            }
            System.out.println();
        }

        scanner.close();
    }
}