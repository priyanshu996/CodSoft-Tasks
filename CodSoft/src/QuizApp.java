import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define quiz questions with options and correct answers
        String[][] quizQuestions = {
                {"What is the capital of France?", "A) London", "B) Berlin", "C) Paris", "D) Madrid", "C"},
                {"Which planet is known as the Red Planet?", "A) Venus", "B) Mars", "C) Jupiter", "D) Saturn", "B"},
                {"What is the largest mammal in the world?", "A) Elephant", "B) Blue Whale", "C) Giraffe", "D) Hippopotamus", "B"}
        };

        System.out.println("Welcome to the Quiz!");

        for (int i = 0; i < quizQuestions.length; i++) {
            String[] question = quizQuestions[i];
            System.out.println("\nQuestion " + (i + 1) + ": " + question[0]);

            for (int j = 1; j < 5; j++) {
                System.out.println(question[j]);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question[5])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + question[5] + "\n");
            }
        }

        System.out.println("Quiz completed! Your score is: " + score + " out of " + quizQuestions.length);
        scanner.close();
    }
}
