package com.github.alekzzzzzz.course;

public class Robot2 extends Robot1 {



    @Override
    public void culc(double number1,double number2) {
        setNumber12(number1,number2);
        System.out.println("Люблю умножать");
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
    }
    public void culc1() {
        System.out.println("Мне неравится число 10 и я люблю умножать");
       double number1 = 10;
       double number2 = 10;
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        System.out.println("10 * 10 =" + res);
    }

}
