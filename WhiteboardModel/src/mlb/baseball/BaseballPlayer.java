package mlb.baseball;

public class BaseballPlayer {
    //public shared constants
    public static final double BATTING_AVG_MIN = 0.000;
    public static final double BATTING_AVG_MAX = 0.999;
    //Fields or Instance variables
    private String name;
    private String team;
    private PositionType positionName = PositionType.FIELDER;
    private double battingAverage; // constraint: mus be less than 1.0 and greater than .000
    private boolean isHallOfFame;

    //constructs
    public BaseballPlayer() {

    }

    public BaseballPlayer(String name) {
        setName(name);
    }

    public BaseballPlayer(String name, String team) {
        this(name);
        setTeam(team);
    }

    public BaseballPlayer(String name, String team, PositionType positionName) {
        this(name, team);
        setPositionName(positionName);
    }

    public BaseballPlayer(String name, String team, PositionType positionName, double battingAverage) {
        this(name, team, positionName);
        setBattingAverage(battingAverage);
    }

    public BaseballPlayer(String name, String team, PositionType positionName,
                          double battingAverage, boolean isHallOfFame) {
        this(name, team, positionName, battingAverage);
        setHallOfFame(isHallOfFame);
    }

    //Business Methods
    public void getAttribute() {
        //boolean stillActive = isActive(); // calling a private function - Fake implementation-(Not in Use)
        System.out.println("This is " + getName() + " Attributes:\n" + "Team: " + getTeam() +
                "\nPosition: " + getPositionName() + "\nCareer Batting Average: " + getBattingAverage() +
                "\nHall of Fame: " + isHallOfFame());
    }

    //Accessor Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        if (battingAverage >= BATTING_AVG_MIN && battingAverage <= BATTING_AVG_MAX) {
            this.battingAverage = battingAverage;
        } else {
            System.out.println("Invalid Batting Average: " + battingAverage + ", BTA must be between " + BATTING_AVG_MIN +
                    " and " + BATTING_AVG_MAX);
        }
    }

    public boolean isHallOfFame() {
        return isHallOfFame;
    }

    public void setHallOfFame(boolean hallOfFame) {
        isHallOfFame = hallOfFame;
    }

    public PositionType getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionType positionName) {
        this.positionName = positionName;
    }

    //toString()
    public String toString() {
        return "BaseballPlayer: Name: " + getName() + ", Team: " + getTeam() + ", Position: " + getPositionName() +
                ", Batting Average: " + getBattingAverage() + ", Is in the Hall of Fame?: " + isHallOfFame();
    }
}