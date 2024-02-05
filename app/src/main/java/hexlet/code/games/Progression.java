package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;


public class Progression {
    public static void play() {
        final int min = 1;
        final int max = 100;
        final int maxStep = 5;
        final int maxLength = 10;
        final int rounds = 3;
        String[][] gameData = new String[rounds][2];
        String gameRules = "What number is missing in the progression?";

        for (int i = 0; i < gameData.length; i++) {
            int progressionStart = Util.generateRandomNumber(min, max);
            int progressionDiff = Util.generateRandomNumber(min, maxStep);
            int progressionLength = Util.generateRandomNumber(maxStep, maxLength);
            StringBuilder progression = new StringBuilder();
            int blankElement = Util.generateRandomNumber(0, progressionLength - 1);

            for (int j = 0; j < progressionLength; j++) {
                if (j == blankElement) {
                    gameData[i][1] = Integer.toString(progressionStart + progressionDiff * j);
                    progression.append(".. ");
                } else {
                    progression.append(progressionStart + progressionDiff * j).append(" ");
                }
            }

            gameData[i][0] = progression.toString().trim();
        }

        Engine.runGame(gameData, gameRules);
    }
}
