package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter. \n");
        System.out.print("1 - Greet\n2 - Even\n0 - Exit \n");
        System.out.println("Your choice: ");
        String gameName = scanner.next();
        if (gameName.equals("1")) {
            Cli.greet(args);
        } else if(gameName.equals("2")){
            isEven.checkEven(args);
        }
        else {
            scanner.close();
        }
    }
}
