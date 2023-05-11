package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;


public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Raylan");

        try {
            emp.goToWork();
        } catch (WorkException e) {
            //System.out.println(e); // toString() automatically called
            //System.out.println(e.getMessage()); //just the reason message
            //e.printStackTrace();
            System.out.println(e.getCause()); // extract the nested cause(egg inside)
        }

    }
}