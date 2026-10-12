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

    // showPower som tar emot en int, Övning 6 – Samma metod, olika magi
    public void showPower(int power) {
        System.out.println("Player power level: " + power);
    }

    // showPower som tar emot en String, Övning 6 – Samma metod, olika magi
    public void showPower(String description) {
        System.out.println("Player power description: " + description);
    }
}