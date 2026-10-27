package Kodstuga.ArraysAndEnum;

public class Hero {

    private int score;

    public int getScore() {
        return score;
    }

    public int setScore(int score) {
        return this.score = score;
    }

    // This method starts the hero game logic
    public void startHero() {

        int[] points = { 10, 20, 5, 50, 15 };
        int total = 0;

        // Sum all points
        for (int p : points) {
            total += p;
        }

        // Give total points to hero
        setScore(total);

        System.out.println("Hero's total score: " + getScore());

        // Extra: find highest score
        int highest = findHighest(points);
        System.out.println("Highest single score: " + highest);
    }

    // Extra method: find highest score in array
    private static int findHighest(int[] points) {
        int max = points[0];

        for (int p : points) {
            if (p > max) {
                max = p;
            }
        }

        return max;
    }
}
