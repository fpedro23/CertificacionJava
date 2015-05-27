package com.modulo5;

/**
 * Created by pedrocontreras on 25/05/15.
 */
public class TestArray {
    public static void main(String[] args) {
        MyDate[] myDates;
        myDates = new MyDate[2];
        myDates[0] = new MyDate(19, 11, 2001);
        MyDate date = new MyDate(19, 11, 2001);
        myDates[1] = date;
        System.out.println(myDates[0].show());
        System.out.println(myDates[1].show());

        String[] names = {
                "Pegro",
                "Pablo",
                "Juan"
        };

        System.out.println(names[2]);

        int[][][] x = new int[2][][]; //Debes de indicar los elementos del primer array
        x[0] = new int[2][];
        x[0][0] = new int[3];
        x[0][1] = new int[4];
        x[0][1][0] = 5;
        x[0][0][2] = 5;

        System.out.println(x[0][1][0]);
        System.out.println(x[0][0][2]);

        x[1] = new int[2][2];

        for (int i = 0; i < x.length; i++) {
            int[][] x1 = x[i];
            for (int j = 0; j < x1.length; j++) {
                int[] x11 = x1[j];
                for (int k = 0; k < x11.length; k++) {
                    //System.out.println(x11[k]);
                }

            }
        }

        for (int a[][] : x) {

            for (int b[] : a) {
                for (int c : b) {
                    //System.out.println(c);
                }
            }
        }

        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[] hold = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.arraycopy(myArray, 1, hold, 1, 3);

        for (int i = 0; i < hold.length; i++) {
            int i1 = hold[i];
            System.out.println(i1);
        }

    }


}
