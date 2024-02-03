package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    private static String gameName = "";
        public static String getGameName() {
        return gameName;
        }
        public static void setGameName(String inputName) {
        gameName = inputName;
        }
    private static String userName;
        public static String getUserName() {
        return userName;
        }
        public static void setUserName(String inputUserName) {
        userName = inputUserName;
        }
    private static int count = 0;
        public static int getCount() {
        return count;
        }
        public static void setCount(int inputCount) {
        count = inputCount;
        }
    private static String roundResult = "";
        public static String getRoundResult() {
        return roundResult;
        }
        public static void setRoundResult(String inputRoundResult) {
        roundResult = inputRoundResult;
        }
    private static String userAnswer = "";
        public static String getUserAnswer (){
            return userAnswer;
        }
        public static void setUserAnswer(String userInput){
            userAnswer = userInput;
        }
    private static String correctAnswer = "";
        public static String getCorrectAnswer(){
            return correctAnswer;
        }
        public static void setCorrectAnswer (String userInput){
            correctAnswer = userInput;
        }
        public static void checkAnswer(){
            if (userAnswer.equals(correctAnswer)) {
                setRoundResult("win");
                setCount(Engine.getCount() + 1);
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                setRoundResult("lost");
                setCount(0);
            }
        }
    static final int FINAL_COUNT = 3;
    public static void greet() {
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        Scanner scannerUsername = new Scanner(System.in);
        setUserName(scannerUsername.next());
        System.out.println("Hello, " + getUserName() + "!");
        //scannerUsername.close();
    }

    public static void userComms() {
        switch (getRoundResult()) {
            case "win":
                System.out.println("Correct!");
                break;
            default:
                break;
        }

        if (getCount() == 0) {
            System.out.print("\nLet's try again, " + getUserName() + "!\n");
            System.exit(0);
        } else if (getCount() == FINAL_COUNT) {
            System.out.print("Congratulations, " + getUserName() + "!\n");
        }
    }
    public static void gameLoop() {
        while (getCount() < FINAL_COUNT) {
            switch (getGameName()) {
                case "2" -> {
                    if (getCount() == 0) {
                        Engine.greet();
                    }
                    Even.checkEven();
                    checkAnswer();
                    userComms();
                }
                case "3" -> {
                    if (getCount() == 0) {
                        Engine.greet();
                    }
                    Calc.calculate();
                    checkAnswer();
                    userComms();
                }
                case "4" -> {
                    if (getCount() == 0) {
                        Engine.greet();
                    }
                    GCD.findGCD();
                    checkAnswer();
                    userComms();
                }
                case "5" -> {
                    if (getCount() == 0) {
                        Engine.greet();
                    }
                    Progression.generator();
                    checkAnswer();
                    userComms();
                }
                case "6" -> {
                    if (getCount() == 0) {
                        Engine.greet();
                    }
                    Prime.primeGame();
                    checkAnswer();
                    userComms();
                }
            }
        }
    }
}
