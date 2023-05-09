package com.television.client;

import com.television.DisplayType;
import com.television.Television;
import com.television.VolumeLevel;
import static com.television.DisplayType.*; //importing the static members of the Display Class
import static com.television.VolumeLevel.*; //importing th static members of the VolumeLevel class

class TelevisionVolumePresetsClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(38);
        Television tv2 = new Television();
        tv2.setVolume(VolumeLevel.LOUD.level());
        Television tv3 = new Television("Samsung",MEDIUM.level(),OLED);
        System.out.println();
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
    }
}