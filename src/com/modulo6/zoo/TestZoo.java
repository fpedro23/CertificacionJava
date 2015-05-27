package com.modulo6.zoo;

/**
 * Created by pedrocontreras on 26/05/15.
 */
public class TestZoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Jirafa jirafa = new Jirafa();
        Leon leon = new Leon();
        Gorila gorila = new Gorila();
        Serpiente serpiente = new Serpiente();
        Rinoceronte rinoceronte = new Rinoceronte();
        Elefante elefante = new Elefante();


        alimentarAnimal(jirafa);
        alimentarAnimal(leon);
        alimentarAnimal(gorila);
        alimentarAnimal(serpiente);
        alimentarAnimal(rinoceronte);
        alimentarAnimal(elefante);

    }

    public static void alimentarAnimal(Animal animal) {
        animal.alimentar();
    }
}
