package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static void play() {
        final int min = 1;
        final int max = 100;
        String[][] gameData = new String[Engine.rounds][2];
        String gameRules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < gameData.length; i++) {
            int num1 = Util.generateRandomNumber(min, max);
            int num2 = Util.generateRandomNumber(min, max);

            gameData[i][0] = num1 + " " + num2;
            gameData[i][1] = Integer.toString(findGCD(num1, num2));
        }

        Engine.runGame(gameData, gameRules);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
