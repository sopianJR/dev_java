package com.tutorial;

public class Main {

    public static void main(String[] args) {

        System.out.println("start program ke 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("loop nilai "+ i);
        }
        System.out.println("finis program");

        System.out.println("start program ke 2");
        for (int i = 0; i < 10; i++) {
            System.out.println("loop nilai "+ i);
        }
        System.out.println("finis program");

        System.out.println("start program ke 3");
        for (int i = 10; i >= 5; i--) {
            System.out.println("loop nilai "+ i);
        }
        System.out.println("finis program");

        System.out.println("start program ke 4");
        int i = 0;
        for ( ; i <= 10; i++) {
            System.out.println("loop nilai "+ i);
        }
        System.out.println("finis program");

    }
}
