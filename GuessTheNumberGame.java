import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 10;
        int score = 0;

        Random random = new Random();
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        JOptionPane.showMessageDialog(null, "Welcome to Guess the Number game!");

        while (numberOfAttempts > 0) {
            String input = JOptionPane.showInputDialog("Guess the number between " + lowerBound + " and " + upperBound + " (" + numberOfAttempts + " attempts left):");

            if (input == null) {
                break; // User clicked Cancel or closed the dialog
            }

            int guessedNumber = Integer.parseInt(input);

            if (guessedNumber == targetNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number.");
                score += numberOfAttempts;
                break;
            } else if (guessedNumber < targetNumber) {
                JOptionPane.showMessageDialog(null, "The number is higher.");
            } else {
                JOptionPane.showMessageDialog(null, "The number is lower.");
            }

            numberOfAttempts--;
        }

        JOptionPane.showMessageDialog(null, "Game over! Your score is: " + score);
    }
}
