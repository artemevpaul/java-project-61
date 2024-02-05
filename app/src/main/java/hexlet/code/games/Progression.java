package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Progression {
    public static void play() {
        System.out.println("Welcome to the Brain Games");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

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

        Engine.runGame(gameData, gameRules, userName);
    }
}
