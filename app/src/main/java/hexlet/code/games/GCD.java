package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class GCD {
    public static void play() {
        System.out.println("Welcome to the Brain Games");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        String[][] gameData = new String[3][2];
        String gameRules = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < gameData.length; i++) {
            int num1 = Util.generateRandomNumber(1, 100);
            int num2 = Util.generateRandomNumber(1, 100);

            gameData[i][0] = num1 + " " + num2;
            gameData[i][1] = Integer.toString(findGCD(num1, num2));
        }

        Engine.runGame(gameData, gameRules, userName);
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
