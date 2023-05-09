package com.mathhelp;

class Calculator {

    //add, subtract, isEven
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    /*
     * Returns a random integer between 1 and 14.
     */
    public static int getRandomInt() {
      //delegate to the min-max version, passing 1 for the min, and 14 for the max
        return getRandomInt(1,14);
    }
    /*
     * Returns a random integer between min and max (inclusive)
     */
    public static int getRandomInt(int min, int max) {
        //----------------------------------------------Instructor code
        int result = 0;

        double rand = Math.random();
        double scaled = rand * (max -min +1);
        result = (int) (scaled + min);
        return result;

    }
    /*
     * Returns the average (arithmetic mean) of the supplied integers
     *getAverage()
     */
    public static double getAverage(int first, int...rest) { //client can pass any number of ints
        double result = 0.0;
        double sum = first;
        for(int value : rest) {
            sum += value;
        }
        result = sum / (1 + rest.length); //at runtime, rest IS AN array

        return result;
    }
}