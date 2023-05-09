package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * client-side main -class to create a few instances of Television
 * and give them a basic test-drive
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances ");
        Television tv1 = new Television("Samsung",Television.MAX_VOLUME, DisplayType.OLED);
        Television tv2 = new Television( "Sony", Television.MIN_VOLUME);
        Television tv3 = new Television("LG");


        //calling the methods.
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println(); //blank line
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();


        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances ");
    }
}