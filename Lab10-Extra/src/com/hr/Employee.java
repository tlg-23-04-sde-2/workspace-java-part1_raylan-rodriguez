package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try - catch and throws a different type of exception
     * Instead of throwing the low-level "infrastucture " transportation exception
     * we'll throw a higher - level more suitable exception for our HR client.
     */
    public void goToWork() throws WorkException{
        Car c = new Car("TKE122gt", "Toyota", "Corolla" );
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to Work", e);
        }
        finally {
            c.stop(); //Important that stop() is always called
        }
    }


    /*
     * Option 3: try -catch and "react in some way," then throw it back to my client
     * this is sometimes a catch-and-rethrow
     */
    /*
    public void goToWork() throws DestinationUnreachableException{
        Car c = new Car("TKE122gt", "Toyota", "Corolla" );
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Send email to your city council to complain");
            throw e;
        }
        finally {
            c.stop(); //Important that stop() is always called
        }
    }
     */

    /*
     * OPTION 2: "punt," do not handle the exception.
     * NOTE: since we dont handle it, and its checked, we have to say "throws"
     * important that stop is called no matter what
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE122gt", "Toyota", "Corolla" );
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop(); //Important that stop() is always called
        }
    }
     */


    /*
     *OPTION 1: try - catch and handle
     * Note taht we use a finally block to ensure that stop() is always called
     * if exception is not thrown
     * if exception is thrown
     */

    /*
    public void goToWork() {
        Car c = new Car("TKE122gt", "Toyota", "Corolla" );
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage()); // Just the reason string
            //System.out.println(e); //toString automatically called
        }
        finally {
            c.stop(); //Important that stop() is always called
        }
    }
     */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}