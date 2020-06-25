package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
//        int hasil = 0;
//
//        for (int i = 1; i <= 10 ; i++) {
//            hasil += i;
//            System.out.println("hasil dari "+i+" + "+hasil+" = "+ hasil);
//        }
//        System.out.println(hasil);

        //program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
        while ( nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditamah "+nilaiAwal+" menjadi "+ total);
            nilaiAwal++;
        }

        // tugas -> for loop, do while

    }
}
