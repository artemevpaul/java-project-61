package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void play() {
        String[][] gameData = new String[3][2];
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < gameData.length; i++) {
            int number = Util.generateRandomNumber(1, 100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(gameData, gameRules);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
