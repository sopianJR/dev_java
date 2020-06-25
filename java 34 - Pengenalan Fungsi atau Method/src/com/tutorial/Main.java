package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //belajar method/fungsi
        // y = (x + 2) * x
        int x,y;
        x = 10;
        y = hitung(x);
        System.out.println("x = "+x+", y = "+y);
        x = 5;
        y = hitung(x);
        System.out.println("x = "+x+", y = "+y);
    }

    static int hitung(int input){
        int hasil = ( input + 2) * input;
        return hasil;
    }

}
