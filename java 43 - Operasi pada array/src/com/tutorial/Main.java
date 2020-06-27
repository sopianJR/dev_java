package com.tutorial;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n====================");
        printArray(arrayAngka1);

        //mengkopi array
        System.out.println("\nMerubah array menjadi string\n====================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nmengkopi dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyoOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopi array dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        System.out.println("\nfill array\n======================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 1);
        printArray(arrayAngka5);

        System.out.println("\nkomparasi array\n======================");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nmembandingkan 2 buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));
        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini beda");
        }

        System.out.println("\nmengecek mana array yg lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nmengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort array
        System.out.println("\nsearch array\n======================");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\nsearch array\n======================");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka "+angka+" ada di index "+ posisi);

        //tugas -> short kebalik
        // operasi aritmatika antara dua buah array
        //menggabungkan array

    }

    private static void  printArray(int[] dataArray){
        System.out.println("array = "+ Arrays.toString(dataArray));
    }
}
