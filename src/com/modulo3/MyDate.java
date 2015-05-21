package com.modulo3;

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

    public static MyDate addDays(int moreDays, MyDate newDate) {
        newDate.day = newDate.day + moreDays;
        moreDays = 19;
        newDate = new MyDate(moreDays, 11, 1986);
        // Not Yet Implemented: wrap around code...
        return newDate;
    }

    public MyDate addDays(int moreDays) {
        MyDate newDate = new MyDate(this);
        newDate.day = newDate.day + moreDays;
        this.day = newDate.day;
        // Not Yet Implemented: wrap around code...
        return newDate;
    }

    public String show() {
        return "" + day + "-" + month + "-" + year;
    }
}