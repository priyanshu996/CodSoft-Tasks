import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Guess the Number game!");

        String playAgain = "yes";
        while (playAgain.equalsIgnoreCase("yes")) {
            rounds++;
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("\nRound " + rounds + ": Try to guess the number between " + minRange + " and " + maxRange + ".");

            while (true) {
                System.out.print("Enter your guess: ");
                try {
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == targetNumber) {
                        System.out.println("Congratulations! You've guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
                        totalAttempts += attempts;
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the input buffer
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();
        }

        double averageAttempts = (double) totalAttempts / rounds;
        System.out.println("\nGame over! You played " + rounds + " rounds with an average of " + String.format("%.2f", averageAttempts) + " attempts per round.");

        scanner.close();
    }
}
