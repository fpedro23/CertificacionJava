package com.modulo3;

public class TestMyDate {

    public static void main(String[] args) {
        MyDate my_birth = new MyDate(22, 7, 1964);
                
        MyDate other_birth = new MyDate(17, 7, 1964);
        int day=5;
        my_birth = MyDate.addDays(day, other_birth);

        System.out.println(my_birth.show());
        System.out.println(other_birth.show());
        
        my_birth.addDays(5);
        System.out.println(my_birth.show());
    }
}