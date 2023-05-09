package mlb.baseball.test;

import mlb.baseball.BaseballPlayer;

class BaseballPlayerValidationTest {
    public static void main(String[] args) {
        BaseballPlayer player = new BaseballPlayer();
        player.setBattingAverage(0.000);
        System.out.println("position: " + player.getBattingAverage());

        player.setBattingAverage(0.999);
        System.out.println("position: " + player.getBattingAverage());

        player.setBattingAverage(-0.999);
        System.out.println("position: " + player.getBattingAverage());

        player.setBattingAverage(1.0);
        System.out.println("position: " + player.getBattingAverage());
    }
}