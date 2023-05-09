package dont.wakeme;

/*
 * class definition to model the workings of an alarm clock
 * this is called a business class or a system class.
 * this class definition does not have a main method - most classes dont.
 */
class AlarmClock {
    // class-level (shared) variable - these live in that sharec/common area "above" the instances.
    //there is only one copy of these, up in that shared/ common area
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20 ;

    //properties or attributes - called "instance variables" or "fields" in Java.
    private int snoozeInterval = 5; // default value when the client doesnt specify one.
    private int repeat = 1;         // default value when client doesnt specify.


    // constructs
    public AlarmClock() {
        //No - op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); //delegate to setter for any validation/conversion
    }

   public AlarmClock(int snoozeInterval, int repeat) {
       this(snoozeInterval); //delegate to ctor above me for snoozeInterval.
       setRepeat(repeat);    // handle repeat myself, by delegating to its setter.
   }

    // business methods - these perform "business tasks" or operations
    public void snooze() {

        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }
    // accessor methods (get/set methods) - provide "controlled access" to the objects fields

    public int getSnoozeInterval() {

        return snoozeInterval;
    }
    // business constraint - must be between [1,20] inclusive.
    // no "magic numbers" 1 and 20. use variables instead.
    public void setSnoozeInterval(int snoozeInterval) {

       if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
           this.snoozeInterval = snoozeInterval;
       }
       else {
           System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                   ", Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
       }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {

        return "AlarmClock: snoozeInterval = " + getSnoozeInterval() + ", repeat  =" + getRepeat();
    }
}