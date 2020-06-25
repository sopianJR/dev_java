package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //switch case
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();

        //eksepresinya berupa satuan (int, long, byte, short), String dan enum
        switch (input){
            case "otong":
                System.out.println("saya otong dan hadir bos");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir bos");
                break;
            case "mario":
                System.out.println("saya mario dan hadir bos");
                break;
            default:
                System.out.println(input+" dia tidak hadir bos");
        }
        System.out.println("finis");
    }
}
