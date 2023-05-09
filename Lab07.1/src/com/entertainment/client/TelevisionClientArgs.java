package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length == 1) {
            Television tv = new Television(args[0]);
            System.out.println(tv);
        } else if (args.length == 2) {
            Television tv = new Television(args[0],Integer.parseInt(args[1]));
            System.out.println(tv);
        } else if (args.length == 3) {
            Television tv = new Television(args[0],Integer.parseInt(args[1]), DisplayType.valueOf(args[2].toUpperCase()));
            System.out.println(tv);
        } else {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Supported brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;
        }
//        String brand = args[0];
//        int volume = Integer.parseInt(args[1]);
//        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());
        System.out.println("Congratulations on your oder, it will arrive soon");

    }
}
