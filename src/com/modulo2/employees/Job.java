package com.modulo2.employees;

/**
 * Created by pedrocontreras on 21/05/15.
 */
public class Job {
    private String title;
    private double maxSalary;
    private double minSalary;

    public Job(String title, double maxSalary, double minSalary) {
        this.title = title;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }
}
