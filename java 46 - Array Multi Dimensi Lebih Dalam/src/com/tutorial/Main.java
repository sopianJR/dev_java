package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array_2D = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.print(Arrays.deepToString(array_2D));
        System.out.print("\n");
        char[] array_cahr1 = {'a','b','c'};
        char[] array_cahr2 = {'d','e'};

        char[][] arrayChar_2D = {
                array_cahr1,
                array_cahr2
        };

        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_cahr1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_cahr2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));


    }
}
