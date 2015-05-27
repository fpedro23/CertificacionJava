package com.modulo2.employees;

import java.util.Date;

/**
 * Created by pedrocontreras on 20/05/15.
 */

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private Job job;
    private Date hireDate;
    private Department department;

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.job = job;
        setDepartment(department);
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 && age<=65){
            this.age = age;
        }
        else{
            System.out.println("Edad Incorrecta, debe ser un número entre 18 y 65");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        Employee[] employeeList = department.getEmployees();
        if (employeeList != null) {
            Employee[] aux = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, aux, 0, employeeList.length);
            aux[aux.length - 1] = this;
            department.setEmployees(aux);
        } else {
            employeeList = new Employee[1];
            employeeList[0] = this;
            department.setEmployees(employeeList);
        }
    }


    public String getDetails() {
        return "Employee{" +
                "Full name='" + this.firstName + " " +
                "" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", Department= " + this.getDepartment().getName() +
                '}';
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", job=" + job +
                ", hireDate=" + hireDate +
                ", department=" + department +
                '}';
    }
}
