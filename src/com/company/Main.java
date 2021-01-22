package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1;
        char e = 1;
        float f = 1;
        double g = 1;
        boolean h = true;
        System.out.println(task3(1, 1, 1, 1));
        System.out.println(task4(10, 5));
        System.out.println(task4(0, 5));
        task5(0);
        System.out.println(task6(-1));
        task7("username");
        System.out.println("Год - 1 " + (task8(1) ? "високосный" : "обычный"));
        System.out.println("Год - 2 " + (task8(2) ? "високосный" : "обычный"));
        System.out.println("Год - 4 " + (task8(4) ? "високосный" : "обычный"));
        System.out.println("Год - 100 " + (task8(100) ? "високосный" : "обычный"));
        System.out.println("Год - 200 " + (task8(200) ? "високосный" : "обычный"));
        System.out.println("Год - 400 " + (task8(400) ? "високосный" : "обычный"));
        System.out.println("Год - 1000 " + (task8(1000) ? "високосный" : "обычный"));
        System.out.println("Год - 2000 " + (task8(2000) ? "високосный" : "обычный"));
        System.out.println("Год - 2020 " + (task8(2020) ? "високосный" : "обычный"));
        System.out.println("Год - 2019 " + (task8(2019) ? "високосный" : "обычный"));
        System.out.println("Год - 2400 " + (task8(2400) ? "високосный" : "обычный"));
        System.out.println("Год - 2096 " + (task8(2096) ? "високосный" : "обычный"));
    }

    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void task5(int a) {
        System.out.println("Число = " + a);
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean task6(int a) {
        return a < 0;
    }

    public static void task7(String str) {
        System.out.println("Привет, " + str + "!");
    }

    public static boolean task8(int a) {
        return a % 4 == 0 && ((a % 100) != 0 || (a % 400 == 0));
    }
}
