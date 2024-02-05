package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Prime {
    public static void play() {
        System.out.println("Welcome to the Brain Games");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        String[][] gameData = new String[3][2];
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < gameData.length; i++) {
            int number = Util.generateRandomNumber(1, 100);
            gameData[i][0] = Integer.toString(number);
            gameData[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(gameData, gameRules, userName);
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
