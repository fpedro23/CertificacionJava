package com.modulo5;

public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(MyDate date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public String show() {
        return "" + day + "-" + month + "-" + year;
    }
}