import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess, count = 0;
        boolean win = false;

        System.out.println("I'm thinking of a number between 1 and 100. Guess what it is!");

        while (count < 10) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number in " + count + " guesses!");
                win = true;
                break;
            } else if (guess < number) {
                System.out.println("Too low. Guess higher.");
            } else {
                System.out.println("Too high. Guess lower.");
            }
        }

        if (!win) {
            System.out.println("Sorry, you didn't guess the number. The number was " + number + ".");
        }

        scanner.close();
    }
}

