package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;


public class Progression {
    public static void play() {
        String[][] gameData = new String[3][2];
        String gameRules = "What number is missing in the progression?";

        for (int i = 0; i < gameData.length; i++) {
            int progressionStart = Util.generateRandomNumber(1, 5);
            int progressionDiff = Util.generateRandomNumber(1, 5);
            int progressionLength = Util.generateRandomNumber(5, 10);
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
