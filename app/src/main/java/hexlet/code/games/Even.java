package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void play() {
        String[][] gameData = new String[3][2];
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < gameData.length; i++) {
            int number = Util.generateRandomNumber(1, 100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.runGame(gameData, gameRules);
    }
}
