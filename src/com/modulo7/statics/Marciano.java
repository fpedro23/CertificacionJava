/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo7.statics;

/**
 * @author Rosa Isela
 */
public class Marciano {

    public static int cuentaMarciano = 0;

    public Marciano() {
        cuentaMarciano++;
    }

    public int getCuentaMarciano() {
        return cuentaMarciano;
    }

    public void setCuentaMarciano(int cuentaMarciano) {
        this.cuentaMarciano = cuentaMarciano;
    }

    public void atacar() {
        if (cuentaMarciano >= 5) {
            System.out.println("Atacar");
        } else {
            System.out.println("Retirarse");
        }
    }
}
