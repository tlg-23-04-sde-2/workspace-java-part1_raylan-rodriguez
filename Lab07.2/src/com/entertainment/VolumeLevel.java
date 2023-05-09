package com.entertainment;

enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private final int level;

    VolumeLevel(int level){
        this.level = level;
    }
    public int level(){
        return level;
    }

}