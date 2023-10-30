package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100. Try to guess it.");

        boolean playAgain = true;

        while (playAgain) {
            int generatedNumber = random.nextInt(max) + 1;
            int attempts = 0;
            int Guess;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                Guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (Guess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else if (Guess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("You've reached the maximum number of attempts for this round.");
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next().toLowerCase();

            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over! You played " + rounds + " round(s) and took " + totalAttempts + " attempt(s).");
        scanner.close();
    }
}

