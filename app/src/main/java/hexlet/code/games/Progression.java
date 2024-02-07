package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;


public class Progression {
    public static void play() {
        final int min = 1;
        final int max = 100;
        final int maxStep = 5;
        final int maxLength = 10;
        String[][] gameData = new String[Engine.ROUNDS][2];
        String gameRules = "What number is missing in the progression?";
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = generateProgression(min, max, maxStep, maxLength);
        }

        Engine.runGame(gameData, gameRules);
    }
    private static String[] generateProgression(int min, int max, int maxStep, int maxLength) {
        int progressionStart = Util.generateRandomNumber(min, max);
        int progressionDiff = Util.generateRandomNumber(min, maxStep);
        int progressionLength = Util.generateRandomNumber(maxStep, maxLength);
        StringBuilder progression = new StringBuilder();
        int blankElement = Util.generateRandomNumber(0, progressionLength - 1);
        var missingNumber = "";

        for (int j = 0; j < progressionLength; j++) {
            if (j == blankElement) {
                missingNumber = Integer.toString(progressionStart + progressionDiff * j);
                progression.append(".. ");
            } else {
                progression.append(progressionStart + progressionDiff * j).append(" ");
            }
        }
        return new String[] {progression.toString().trim(), missingNumber};
    }
}
