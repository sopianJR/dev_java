package com.tutorial;

public class Main {

    public static void main(String[] args){

        //integer, byte, short, long, double, float, char, boolean

        //integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer i = "+ i);
        System.out.println("nilai max " + Integer.MAX_VALUE);
        System.out.println("nilai min " + Integer.MIN_VALUE);
        System.out.println("besar integer " + Integer.BYTES +" bytes");
        System.out.println("besar integer " + Integer.SIZE +" bit");

        //byte
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai byte b = "+ b);
        System.out.println("nilai max " + Byte.MAX_VALUE);
        System.out.println("nilai min " + Byte.MIN_VALUE);
        System.out.println("besar byte " + Byte.BYTES +" bytes");
        System.out.println("besar byte " + Byte.SIZE +" bit");

        //short
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai short s = "+ s);
        System.out.println("nilai max " + Short.MAX_VALUE);
        System.out.println("nilai min " + Short.MIN_VALUE);
        System.out.println("besar short " + Short.BYTES +" bytes");
        System.out.println("besar short " + Short.SIZE +" bit");

        //long
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("nilai long l = "+ l);
        System.out.println("nilai max " + Long.MAX_VALUE);
        System.out.println("nilai min " + Long.MIN_VALUE);
        System.out.println("besar long " + Long.BYTES +" bytes");
        System.out.println("besar long " + Long.SIZE +" bit");

        //double
        double d = 10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai double d = "+ d);
        System.out.println("nilai max " + Double.MAX_VALUE);
        System.out.println("nilai min " + Double.MIN_VALUE);
        System.out.println("besar double " + Double.BYTES +" bytes");
        System.out.println("besar double " + Double.SIZE +" bit");

        //float
        float f = -8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai float f = "+ f);
        System.out.println("nilai max " + Float.MAX_VALUE);
        System.out.println("nilai min " + Float.MIN_VALUE);
        System.out.println("besar float " + Float.BYTES +" bytes");
        System.out.println("besar float " + Float.SIZE +" bit");

        //char
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai char c = "+ c);
        System.out.println("nilai max " + Character.MAX_VALUE);
        System.out.println("nilai min " + Character.MIN_VALUE);
        System.out.println("besar char " + Character.BYTES +" bytes");
        System.out.println("besar char " + Character.SIZE +" bit");

        //boolean
        boolean val = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean val = "+ val);
        System.out.println("nilai max " + Boolean.TRUE);
        System.out.println("nilai min " + Boolean.FALSE);

    }
}
