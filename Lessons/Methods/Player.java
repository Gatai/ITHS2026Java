package Lessons.Methods;

import java.util.Random;
import Helper.TerminalColors;

// player ärver 
public class Player extends Fighter {
    private final Random random = new Random();
    private int score;

    public Player() {
        super("Player", 150); // konstruktorn från fighter klassen
        score = random.nextInt(100) + 1;
    }

    @Override
    public void attack(Fighter target) {
        int damage = random.nextInt(16) + 10;

        System.out.println(TerminalColors.PLAYER
                + getName() + " attacks " + target.getName()
                + " for " + damage + " damage"
                + TerminalColors.RESET);
        target.takeDamage(damage);
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