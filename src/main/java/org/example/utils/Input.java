package org.example.utils;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDouble () {
        System.out.println("Ввeдите число");
        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            scanner.nextLine();
            return num;
        }
        scanner.next();
        System.out.println(scanner.nextLine() + " - это не число. Повторите ввод");
        return getDouble();
    }

    public static String getString () {
        System.out.println("Введите тип предполагаемой опреации");
        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextLine() + " - это не строка. Повторите ввод");
        }
        return scanner.nextLine();
    }

}
