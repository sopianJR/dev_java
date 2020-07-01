package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //pengenalan string

        //membuat string
        String kataString = "hallo";
        char[] kataChar = {'h','a','l','l','o'};

        //menampilkan string
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen dari string
        System.out.println("komponen pertama dari char[] = "+ kataChar[0]);
        System.out.println("komponen pertama dari String = "+ kataString.charAt(0));

        //merubah komponen dari String
        //itu tidak bisa...kenapa?, karena string di java itu immutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        //kataString[0] = "c"; <---- tidak bisa
        //kataString.charAt(0) = "c"; <---- tidak bisa

        //kita dapat merubah komponen secara tidak langsung

        printAdress("kataString",kataString);

        kataString = "c"+ kataString.substring(1,5);
        System.out.println(kataString);

        printAdress("kataString",kataString);

        //memori dari string (String pool)
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        printAdress("str_1", str_1);
        printAdress("str_2", str_2);
        printAdress("str_3", str_3);

        str_3 = str_3.substring(0,4);
        printAdress("str_3", str_3);

        String str_4 = "callo";
        printAdress("str_4", str_4);

        kataString = "callo";
        printAdress("kataString", kataString);

        //1. String di java itu immutable
        //2. String yang berada di String pool itu akan reuseable, memorynya lebih efisien
        //3. membuat string dengan method baru, maka dia akan ditaro di memory lain bukan di string pool

        //lihat lebih dalam

        String a = new String("hallo");
        printAdress("a", a);
    }

    private static void printAdress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama +" = "+ data +"\t|| adress= "+ Integer.toHexString(address));
    }
}
