package com.github.alekzzzzzz.course;

public class Robot1 {

   private double number1;
   private double number2;


     void setNumber12(double a,double b) {
        this.number1 = a;
        this.number2 = b;
         System.out.println("Поля number1 и number2 = " + a +" и " + b );
     }


    public void culc(double a,double b){
        setNumber12(a,b);
        MathOperations mathOperations = new MathOperations();
       double res = mathOperations.summa(a,b);
        System.out.println("сумма a + b = " + res);
       double res1 = mathOperations.proizvedenie(a,b);
        System.out.println("произведение a + b = " + res1);
        double res2 = mathOperations.chastnoe(a,b);
        System.out.println("частное a + b = " + res2);
    }

}
