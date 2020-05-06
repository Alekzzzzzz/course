package com.github.alekzzzzzz.course;

public class Robot1 {

   private double number1;
   private double number2;


     void setNumber1(double a) {
        this.number1 = a;
     }

     void setNumber2(double b) {
        this.number2 = b;

    }

    public void culc(){
        MathOperations mathOperations = new MathOperations();
       double res = mathOperations.summa(number1,number2);
        System.out.println("сумма " + number1+" + " + number2 + " = "  + res);
       double res1 = mathOperations.proizvedenie(number1,number2);
        System.out.println("произведение "+ number1 +" * "+ number2+ "= " + res1);
        double res2 = mathOperations.chastnoe(number1,number2);
        System.out.println("частное "+ number1 +" / "+ number2+ "= " + res2);
        System.out.println();
    }

}
