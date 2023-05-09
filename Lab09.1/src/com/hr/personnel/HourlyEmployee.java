package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    //constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name,hireDate);     //delegate to neighboring ctor above me for name, hire date
        setHours(hours);        //delegate to setters
        setRate(rate);
    }

    //business Methods or actin methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid Hourly " + payment);
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " +
                ((getRate()*getHours()) * HOURLY_TAX_RATE ));
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: " + getRate() + ", Hours: " + getHours();
    }
}