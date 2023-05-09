/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1750.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),45.0, 20.0));
        dept.addEmployee(new SalariedEmployee("Miguel", LocalDate.of(2023,2,15),1500.0));
        dept.addEmployee(new HourlyEmployee("Pedro", LocalDate.of(2021,11,28), 35.0,40));
        dept.addEmployee(new Executive("Raylan", LocalDate.of(2022,2,2), 250000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay all Employees
        System.out.println("\nPay all employees");
        dept.payEmployees();

        //Forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}