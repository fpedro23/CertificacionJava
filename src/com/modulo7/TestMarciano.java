package com.modulo7;

import com.modulo7.statics.Marciano;

import java.util.ArrayList;

/**
 * Created by pedrocontreras on 27/05/15.
 */
public class TestMarciano {
    public static void main(String[] args) {

        ArrayList<Marciano> marcianos = new ArrayList<Marciano>();

        for (double i = 0; i < 5; i++) {
            marcianos.add(new Marciano());
        }

        System.out.println("Numero de marcianos: " + Marciano.cuentaMarciano);
        marcianos.get(4).atacar();
    }
}
