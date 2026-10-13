package Lessons.Methods;

import java.util.Random;
import Helper.TerminalColors;

public class Monster extends Fighter {
    private final Random random = new Random();

    public Monster() {
        super("Monster Boss ", 150);
    }

    @Override
    public void attack(Fighter target) {
        int damage = random.nextInt(16) + 10;

        System.out.println(TerminalColors.MONSTER
                + getName() + " attacks " + target.getName()
                + " for " + damage + " damage"
                + TerminalColors.RESET);
        target.takeDamage(damage);
    }
}
