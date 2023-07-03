import java.lang.Math;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        starter();
    }

    public static void starter() {
        game(randomNumber());
    }

    private static int randomNumber() {
        int random = (int) (Math.random() * 100 + 1);
        return random;
    }

    private static void game (int theNumber) {
        int min = 0;
        int max = 100;
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Make a guess: (between " + min + " ~ " + max + "): ");
            int guess = s.nextInt();
            if (theNumber == guess) {
                System.out.println("You win.");
                break;
            } else if (theNumber > guess) {
                min = guess;
            } else if (theNumber < guess) {
                max = guess;
            } else {
                System.out.println("WTF!");
            }
        }
    }
}
