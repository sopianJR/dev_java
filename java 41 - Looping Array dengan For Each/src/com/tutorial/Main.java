package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        //looping standard
        System.out.println("Looping standard");
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke-"+i+" adalah = "+ arrayAngka[i]);
        }

        System.out.println("Looping dengan properti length");
        System.out.println("panjang array = "+ arrayAngka.length);
        //looping dengan properti dari array
        for (int i = 0; i < arrayAngka.length ; i++) {
            System.out.println("index ke-"+i+" adalah = "+ arrayAngka[i]);
        }

        //Looping khusuon untuk collection <- array
        System.out.println("looping for each");
        for ( int angka : arrayAngka){
            System.out.println("angka pada looping ini = "+ angka);
        }
        
    }
}
