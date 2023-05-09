package com.television;/*
 * Business class (System Class) to model the workings of a Television.
 */

public class Television {
    //class (static) variables - shared among all instances.
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung","LG","Sony","Toshiba"};
    private static int instanceCount =0;
    public static int getInstanceCount() {
        return instanceCount;
    }
    private static boolean isValidBrand(String brand) {
        for(String b : VALID_BRANDS) {
            if(b.equals(brand)) {
                 return true;
            }
        }
        return false;
    }
    //instance variables or fields(properties or attributes)
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;   // otherwise, null if client doesnt say

    private boolean isMuted; // for muting behavior
    private int oldVolume;   //  for muting behavior, internal use only, no get/set methods

    public Television() {
        instanceCount++;
    }
    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }
    //3- arg ctor right here (brand,volume, display)
    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);
    }

    // business methods or operations
    public void mute() {
        if (!isMuted()) {  // not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }
   public void turnOn() {

       boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on " + getBrand() + " TV Volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("turning Off " + getBrand() + " Good Bye");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
       if(isValidBrand(brand)) {
           this.brand = brand;
       }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;

            // clear the 'ismuted' flag, in case we were muted
            isMuted = false;
        }
        else {
            System.out.println("Invalid Number: " + volume + " It must be between: " + MIN_VOLUME +
                               " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }
    private boolean verifyInternetConnection() {
       return true; //fake implementation
    }
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: brand= " + getBrand() + ", Volume= " + volumeString + ", Display Type: " + getDisplay();
    }
}