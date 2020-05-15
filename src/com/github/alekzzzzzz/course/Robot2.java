package com.github.alekzzzzzz.course;

public class Robot2 extends Robot1 {

    private static double number1;
    private static double number2;

   static void setNumber1(double a) {
        number1 = a;
    }

  static   void setNumber2(double b) {
       number2 = b;

    }

    public double getNumber1() {
        return number1 = 10;
    }

    public double getNumber2() {
        return number2 = 10;
    }


    public static void culc() {
        System.out.println("я Robot2 и я Люблю умножать");
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
    }
    public void culc1() {
        System.out.println("Мне нравится число 10 и я люблю умножать");
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(getNumber1(),getNumber2());
        System.out.println("10 * 10 = " + res);
    }

}
