package mlb.baseball.client;

import mlb.baseball.BaseballPlayer;
import mlb.baseball.PositionType;
import java.util.Arrays;

class BaseballPlayerClientArgs {

    public static void main(String[] args) {
        if(args.length == 1) {
            BaseballPlayer bp = new BaseballPlayer(args[0]);
            System.out.println(bp);
        }
        else if(args.length == 2) {
            BaseballPlayer bp = new BaseballPlayer(args[0],args[1]);
            System.out.println(bp);
        }
        else if(args.length == 3) {
            BaseballPlayer bp = new BaseballPlayer(args[0],args[1], PositionType.valueOf(args[2].toUpperCase()));
            System.out.println(bp);
        }
        else if(args.length == 4) {
            BaseballPlayer bp = new BaseballPlayer(args[0],args[1], PositionType.valueOf(args[2].toUpperCase()),
                                 Double.parseDouble(args[3]));
            System.out.println(bp);
        }
        else if(args.length == 5) {
            BaseballPlayer bp = new BaseballPlayer(args[0],args[1], PositionType.valueOf(args[2].toUpperCase()),
                    Double.parseDouble(args[3]),Boolean.parseBoolean(args[4]));
            System.out.println(bp);
        }
        else {
            String usage = "Usage: java BaseballPlayerArgs <name> <team> <position> <Batting Average> " +
                           "<Hall of Fame? T/F? >";
            String example = "Example: java BaseballPlayerArgs Alex Rodriguez Yankees Third_Basement .296 false";
            String note1 = "Note: supported Positions" + Arrays.toString(PositionType.values());
            String note2 = "Supported Batting Average Range: " + BaseballPlayer.BATTING_AVG_MIN + " to " +
                            BaseballPlayer.BATTING_AVG_MAX;
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println();
            System.out.println("PLEASE TRY AGAIN USING THE CORRECT FORMAT, THANK YOU!");
            return;
        }
        System.out.println("Thank You, we have received your input");
    }
}