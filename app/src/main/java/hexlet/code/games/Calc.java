package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void play() {
        final int rounds = 3;
        final int min = 1;
        final int max = 10;
        String[][] gameData = new String[rounds][2];
        String gameRules = "What is the result of the expression?";
        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < gameData.length; i++) {
            int num1 = Util.generateRandomNumber(min, max);
            int num2 = Util.generateRandomNumber(min, max);
            String operation = operations[Util.generateRandomNumber(0, operations.length - 1)];

            int answer;
            switch (operation) {
                case "+":
                    answer = num1 + num2;
                    break;
                case "-":
                    answer = num1 - num2;
                    break;
                case "*":
                    answer = num1 * num2;
                    break;
                default:
                    throw new IllegalStateException("Unexpected operation: " + operation);
            }

            gameData[i][0] = num1 + " " + operation + " " + num2;
            gameData[i][1] = Integer.toString(answer);
        }

        Engine.runGame(gameData, gameRules);
    }
}
