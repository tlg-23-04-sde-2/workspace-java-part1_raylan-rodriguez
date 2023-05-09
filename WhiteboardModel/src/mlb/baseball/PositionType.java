package mlb.baseball;

public enum PositionType {
    PITCHER("Pitcher(P)"),
    CATCHER("Catcher(C)"),
    FIRST_BASEMENT("First Basement(1B)"),
    SECOND_BASEMENT("Second Basement(2B)"),
    SHORT_STOP("Short Stop(SS)"),
    THIRD_BASEMENT("Third Basement(3B)"),
    RIGHT_FIELDER("Right Fielder(RF)"),
    LEFT_FIELDER("Left Fielder(LF)"),
    CENTER_FIELDER("Center Fielder(CF)"),
    FIELDER("Bench/DH");

    private final String position;

    //constructor
    PositionType(String position) {
        this.position = position;
    }

    // accessor methods
    public String position() {
        return position;
    }

    public String toString() {
        return position();
    }
}
