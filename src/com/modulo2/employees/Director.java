package com.modulo2.employees;

import java.util.Date;

/**
 * Created by pedrocontreras on 25/05/15.
 */
public class Director extends Manager {

    public Director(Employee secretary, String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        super(secretary, firstName, lastName, email, phoneNumber, hireDate, job);
    }

    public Director(Employee secretary, String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        super(secretary, firstName, lastName, email, phoneNumber, hireDate, job, department);
    }

    public void setSalary(Employee employee, double salary) {

        employee.setSalary(salary);
    }
}
