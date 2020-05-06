package com.github.alekzzzzzz.course;

public class Robot2 extends Robot1 {

    private double number1;
    private double number2;

    void setNumber1(double a) {
        this.number1 = a;
    }

    void setNumber2(double b) {
        this.number2 = b;

    }


    @Override
    public void culc() {
        System.out.println("я Robot2 и я Люблю умножать");
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
        System.out.println(number1 + " * " + number2 + " = " + res);
    }
    public void culc1() {
        System.out.println("Мне неравится число 10 и я люблю умножать");
        MathOperations mathOperations = new MathOperations();
        setNumber1(10);
        setNumber2(10);
        double res =  mathOperations.proizvedenie(number1,number2);
        System.out.println("10 * 10 =" + res);
    }

}
