package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //enroll in 401K
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); //delegate to neighboring ctor above me, for name, hire date
        setSalary(salary);
    }

    //business methods or actions methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()  + ", salary= " + getSalary();
    }
}