package com.github.alekzzzzzz.course;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
       Robot1 robot1 = new Robot1();
       Robot2 robot2 =  new Robot2();
       robot1.culc(10,2);
       robot2.culc(10,5);
       robot2.culc1();
    }

    private static int  fibo1(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return  1;
        } else {
            return fibo1(i - 2) + fibo1(i - 1);
        }

    }

    private static int fibo2(int a) {
        int first = 0;
        int next = 1;
        int courent = 0;
        System.out.println(first);
        System.out.println(next);
        for (int i = 1; i < a; i++){
            courent = first + next;
            first = next;
            next = courent;
            System.out.println(courent);
        }
        return courent;
    }

}
