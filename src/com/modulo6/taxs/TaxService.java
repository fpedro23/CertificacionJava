/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo6.taxs;

import com.modulo2.employees.Employee;
import com.modulo2.employees.Manager;

/**
 * @author Humberto
 */
public class TaxService {

    public double getTaxeRate(Employee e) {
        if (e.getSalary() * 12 > 400000.00) {
            return 0.40;
        } else if (e.getSalary() * 12 > 300000.00) {
            return 0.30;
        } else if (e.getSalary() * 12 > 200000.00) {
            return 0.20;
        } else if (e.getSalary() * 12 > 100000.00) {
            return 0.10;
        } else {
            return 0.05;
        }
    }

    public double findNetPay(Employee employee) {
        double bonus = 0;

        if (employee instanceof Manager) {
            bonus = 1500;
        }

        return employee.getSalary() - employee.getSalary() * getTaxeRate(employee) + bonus;
    }
}
