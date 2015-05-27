package com.modulo6.wrapper;

/**
 * Created by pedrocontreras on 27/05/15.
 */
public class TestWrapper {
    public static void main(String[] args) {
        Integer i = new Integer(5); //Boxing
        Integer integer = 5; //Autoboxing
        integer++;
        Boolean aBoolean = new Boolean("false");
        boolean b = Boolean.valueOf("true");

        System.out.println(i);
        System.out.println(integer);
        System.out.println(aBoolean);
        System.out.println(b);

    }

}
