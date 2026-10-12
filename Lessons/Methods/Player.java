package Lessons.Methods;

import java.util.Random;

public class Player {
    private int score;

    public Player() {
        Random ran = new Random();
        score = ran.nextInt(100) + 1;
    }

    public int getScore() {
        return score;
    }
}