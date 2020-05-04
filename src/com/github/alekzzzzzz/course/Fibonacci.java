package com.github.alekzzzzzz.course;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println(fibo(10));
    }

    private static int  fibo(int a) {
        int first = 0;
        int next = 1;
        int courent = 0;
        System.out.println(first);
        System.out.println(next);
        for (int i = 1; i < 10;i++){
            courent = first + next;
            first = next;
            next = courent;
            System.out.println(courent);

        }
        return courent;
    }
}
