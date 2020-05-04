package com.github.alekzzzzzz.course;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println(fibo(10));
    }

    private static int fibo(int i) {
        if (i == 0) {
            return 0;
        }if (i == 1){
            return 1;
        }else {
            return fibo(i - 2) + fibo(i -1);
        }
    }
}
