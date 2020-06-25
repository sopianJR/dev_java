package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
//        int input = userInput.nextInt();
//        System.out.println("Input = "+ input);
//        int input2 = userInput.nextInt();
//        System.out.println("Input2 = "+ input2);

        //Membuat perhtungan luas -> persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = "+ volume);


    }
}
