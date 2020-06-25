package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // break, continue, dan return

        int a = 0;
        while (true){
            a++;
            if (a == 10) {
                break; // ini adalah keyword untuk keluar dari loop
            }else if(a == 5){
                continue; // ini adalah keyword untuk memulai aksi dari awal
            }else if (a == 7){
                return; // ini adalah kerword menyelesaikan method
            }
            System.out.println("looping ke - "+ a);
        }
        System.out.println("finis looping");
    }
}
