package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // menghitung deret nilai fibonancci ke-n
        int a,b,c,n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - ");
        n = inputUser.nextInt();
        c = 0;
        b = 1;
        a = 1;
//        System.out.print(a);
        for (int i = 1; i <= n ; i++) {
            System.out.println("nilai ke - "+i+" adalah "+ a);
            a = b + c ;
            c = b ;
            b = a;
        }
    }
}
