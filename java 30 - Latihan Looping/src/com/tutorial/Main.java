package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


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
//        for ( int i = nilaiAwal ; i <= nilaiAkhir ; i++) {
//            total = total + i;
//            System.out.println("ditamah "+i+" menjadi "+ total);
//        }

    }
}
