package hexlet.code;

public class Util {

    public static int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
