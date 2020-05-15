package com.github.alekzzzzzz.course;

public class Robot1 {

   private static double number1;
   private static double number2;


   static void  setNumber1(double a) {
        number1 = a;
     }

   static   void setNumber2(double b) {
        number2 = b;

    }


    public static void culc(){
        MathOperations mathOperations = new MathOperations();
       double res = mathOperations.summa(number1,number2);
        System.out.println("сумма " + number1+" + " + number2 + " = "  + res);
       double res1 = mathOperations.proizvedenie(number1,number2);
        System.out.println("произведение "+ number1 +" * "+ number2+ " = " + res1);
        double res2 = mathOperations.chastnoe(number1,number2);
        System.out.println("частное "+ number1 +" / "+ number2+ " = " + res2);
        System.out.println();
        System.out.println("Еще у меня есть доп калькулятор");
        System.out.println("Используйте подсказки ниже");
        Calculator calculator = new Calculator();
    }



}
