package com.github.alekzzzzzz.course;

public class Robot2 extends Robot1 {



    @Override
    public String culc(double number1,double number2) {
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        double res1 = mathOperations.proizvedenie(number1,number2);
        double res2 = mathOperations.proizvedenie(number1,number2);
        String res3 = res +" "+ res1+" "+ res2;
        return res3;
    }
    public String culc1(double number1,double number2) {
        number1 = 10;
        number2 = 10;
        MathOperations mathOperations = new MathOperations();
        double res =  mathOperations.proizvedenie(number1,number2);
        String res3 = res + "";
        return res3;
    }

}
