package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void play() {
        final int min = 1;
        final int max = 100;
        String[][] gameData = new String[Engine.ROUNDS][2];
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < gameData.length; i++) {
            int number = Util.generateRandomNumber(min, max);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = checkEven(number);
        }

        Engine.runGame(gameData, gameRules);
    }
    private static String checkEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
