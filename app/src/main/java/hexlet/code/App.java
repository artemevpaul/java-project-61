package hexlet.code;

import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static String gameName = "";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter. \n");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit \n");
        System.out.println("Your choice: ");
        gameName = scanner.next();
        if(gameName.equals("1")) {
            Cli.greet();
        } else if (!gameName.equals("0")) {
            Engine.gameLoop();
        } else {
            scanner.close();
        }
    }
}
