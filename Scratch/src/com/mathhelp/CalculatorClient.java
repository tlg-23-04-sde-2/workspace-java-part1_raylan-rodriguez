package com.mathhelp;

class CalculatorClient {

    public static void main(String[] args) {

        double sum = Calculator.add(3, 5);
        System.out.println("The Sum is " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3.1,5.1));

        System.out.println("10 is even: " + Calculator.isEven(11));

        System.out.println();

        System.out.println(Calculator.getRandomInt());

        System.out.println();

        System.out.println(Calculator.getRandomInt(5,20));

        System.out.println(Calculator.getAverage(3,5,9,9)); // any number of  "loose"  int
        System.out.println();
        System.out.println(Calculator.getAverage(56)); // I can pass nothing

    }
}