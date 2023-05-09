package mlb.baseball.client;

import mlb.baseball.BaseballPlayer;
import mlb.baseball.PositionType;

class BaseballPlayerClient {
    public static void main(String[] args) {
        BaseballPlayer player1 = new BaseballPlayer("Derek Jeter", "Yankees", PositionType.SHORT_STOP, .310, true);
        player1.getAttribute(); //get the player attributes

        System.out.println();   //Insert blank space

        BaseballPlayer player2 = new BaseballPlayer("Alex Rodriguez", "Yankees", PositionType.THIRD_BASEMENT,
                .296, false);
        player2.getAttribute();  //get the player attributes

        System.out.println();    //Insert blank space

        BaseballPlayer player3 = new BaseballPlayer("Raylan Rodriguez", "Viper", PositionType.SECOND_BASEMENT, .456);
        player3.getAttribute();  //get the player attributes

        System.out.println();    //Insert blank space

        BaseballPlayer player4 = new BaseballPlayer("Pedro Lazar");
        player4.getAttribute();

        System.out.println();

        //toString()
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
    }
}
