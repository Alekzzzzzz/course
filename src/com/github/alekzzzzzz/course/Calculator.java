package com.github.alekzzzzzz.course;

import java.util.Scanner;

public class Calculator {

    /*
     * Создаем конструкор калькулятор
     */
     Calculator() {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOperations = new MathOperations();
        double result = 0;
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Теперь выберите команду ");
        System.out.println("1 чтобы получить сумму");
        System.out.println("2 чтобы получить разность");
        System.out.println("3 чтобы получить частное");
        System.out.println("4 чтобы получить произведение");
        int c = scanner.nextInt();
        if (c == 1){
          result =  mathOperations.summa(a,b);
            System.out.println("Сумма чисел = " + result);
        }
        if (c == 2){
            result = mathOperations.raznost(a,b);
            System.out.println("Разница чисел = " + result);
        }
        if (c == 3){
          result =  mathOperations.chastnoe(a,b);
            System.out.println("Частное чисел = " + result);
        }
        if (c == 4){
          result =  mathOperations.proizvedenie(a,b);
            System.out.println("Произведение чисел = " + result);
        }
         System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }
}
