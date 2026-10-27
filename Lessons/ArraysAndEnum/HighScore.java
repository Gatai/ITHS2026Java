package Lessons.ArraysAndEnum;

import java.util.Arrays;

public abstract class HighScore {
    private static int[] scores = { 10, 25, 40, 5, 30 };

    public static void printScoresAndTotal() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        System.out.println("Total: " + calculateTotalScore(scores));

        // Sortera listan
        Arrays.sort(scores);

        // Skriv ut sorterad lista
        System.out.println("\nSorted scores:");
        System.out.println(Arrays.toString(scores));

        int highestScore = scores[scores.length - 1];
        System.out.println("Highest score: " + highestScore);
    }

    private static int calculateTotalScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
}
