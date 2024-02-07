package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void play() {
        final int min = 1;
        final int max = 10;
        String[][] gameData = new String[Engine.rounds][2];
        String gameRules = "What is the result of the expression?";
        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < gameData.length; i++) {
            int num1 = Util.generateRandomNumber(min, max);
            int num2 = Util.generateRandomNumber(min, max);
            String operation = operations[Util.generateRandomNumber(0, operations.length - 1)];

            int answer = calculateAnswer(num1, num2, operation);

            gameData[i][0] = num1 + " " + operation + " " + num2;
            gameData[i][1] = Integer.toString(answer);
        }

        Engine.runGame(gameData, gameRules);
    }

    private static int calculateAnswer(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                throw new IllegalStateException("Unexpected operation: " + operation);
        }
    }
}
