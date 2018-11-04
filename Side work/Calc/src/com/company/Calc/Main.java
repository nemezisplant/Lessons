package com.company.Calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int action;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор");
        System.out.println("выберите действие");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Возведение в степень");
        action = scanner.nextInt();

        if (action <= 4) {
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();

            if (action == 1) {
              System.out.println("Рузельтат = " + (a + b));
            } else if (action == 2) {
              System.out.println("Рузельтат = " + (a - b));
            } else if (action == 3) {
              System.out.println("Рузельтат = " + (a * b));
            } else if (action == 4) {
              System.out.println("Рузельтат = " + (a / b));
            }
        } else {
            System.out.println("Введите число которое необходимо возвести в степень.");
            int a = scanner.nextInt();
            System.out.println("Введите степень в которую необходимо возвести число.");
            int b = scanner.nextInt();
            System.out.println("Результат возведения в степень = " + Math.pow(a, b));
        }
        scanner.close();
    }
}

