package com.modulo3;

/**
 * Created by pedrocontreras on 21/05/15.
 */
public class TestPrimitives {

    public static void main(String[] args) {
        //Logical
        boolean resultado = true;
        System.out.println(resultado);

        //Textual
        char c = 'A';
        char c1 = '\u004b';
        char c2 = '\t';
        System.out.println(c2 + "" + c);

        String s = "Buongiorno principessa" + 5 + 4;
        System.out.println(s);

        //Integer
        byte b = 127;
        byte b1 = -128;

        System.out.println(b1);

        short i = 32767;
        short i1 = -32768;
        int i2 = 2147483647;
        int i3 = -2147483648;
        //Octal
        int six = 06;
        System.out.println("Octal 06: " + six);

        //Hexadecimal
        int cafe = 0xDeadCafe;
        System.out.println("Hexadecimal Cafe: "+cafe);

        //Floating point
        float f = 123.456f;





    }

}

