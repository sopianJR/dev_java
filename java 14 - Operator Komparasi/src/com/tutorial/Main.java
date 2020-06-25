package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //operator komparasi ..  ini akan menghasilakan nilai dalam boolean

        int a,b;
        boolean hasilKomparasi;
        // operator equal atau persamaan
        System.out.println("====== PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        // operator not equal atau persamaan
        System.out.println("====== PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("====== PERTIDAKSAMAAN");
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("====== KURANG DARI");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("====== KURANG DARI");
        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("====== LEBIH DARI");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("====== LEBIH DARI");
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        // operator less than equal atau kurang dari sama degan
        System.out.println("====== KURANG DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("====== KURANG DARI SAMA DENGAN");
        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama degan
        System.out.println("====== LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        System.out.println("====== LEBIH DARI SAMA DENGAN");
        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
    }
}
