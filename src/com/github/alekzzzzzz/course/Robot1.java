package com.github.alekzzzzzz.course;

public class Robot1 {

   private double number1;
   private double number2;


    public void setNumber1(double a) {
        this.number1 = a;
    }

    public void setNumber2(double b) {
        this.number2 = b;
    }


    public String culc(double a,double b){
        setNumber1(a); ;
        setNumber2(b);
        MathOperations mathOperations = new MathOperations();
       double res = mathOperations.summa(a,b);
       double res1 = mathOperations.proizvedenie(a,b);
        double res2 = mathOperations.chastnoe(a,b);
        String res3 = res +" "+ res1+" "+res2;
        return res3;
    }

}
