import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordGame {
    public static void main(String[] args) {
        starter();
    }

    public static void starter () {
        game(randomNumber());
    }

    private static int randomNumber () {
        return (int) (Math.random() * 100 + 1);
    }

    private static void game (int theNumber) {
        int min = 0;
        int max = 100;

        while(true) {
            int guess = guess(min, max);
            if (theNumber == guess) {
                System.out.println("You win.");
                break;
            } else if (theNumber > guess) {
                min = guess;
            } else {
                max = guess;
            }
        }
    }

    private static int guess (int min, int max) {

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Make a guess: (between " + min + " ~ " + max + "): ");

            try {
                int guess = s.nextInt();
                if (guess < max && guess > min) {
                    return guess;
                }
                else {
                    System.out.println("Invalid number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                s.nextLine();
            }

        }
    }
}
