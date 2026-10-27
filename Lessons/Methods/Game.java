package Lessons.Methods;

import Helper.TerminalColors;

public class Game {
    private final Player player;
    private final Monster monster;

    public Game(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    public static void playFights(int numberOfFights) {
        for (int round = 1; round <= numberOfFights; round++) {
            System.out.println("===================== Fight " + round + " ======================");

            Player player = new Player();
            Monster monster = new Monster();
            Game game = new Game(player, monster);

            game.startFight();
        }
    }

    public void startFight() {

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster); // player attack på monster
            System.out.println(monster.getName() + " health: " + monster.getHealth());

            if (monster.isAlive()) {
                monster.attack(player); // monster attack player
                System.out.println(player.getName() + " health: " + player.getHealth());
            }
        }

        if (player.isAlive()) {
            // System.out.println(player.getName() + " wins!");
            System.out.println(TerminalColors.WINNER + player.getName() + " wins!" + TerminalColors.RESET);
        } else {
            // System.out.println(monster.getName() + " wins!");
            System.out.println(TerminalColors.WINNER + monster.getName() + " wins!" + TerminalColors.RESET);
        }
    }

    public static void determineWinner(Player p1, Player p2) {
        if (p1.getScore() > p2.getScore()) {
            System.out.println("Player 1 wins! ");
            System.out.println("Player 1 has: " + p1.getScore());
        } else if (p2.getScore() > p1.getScore()) {
            System.out.println("Player 2 wins! ");
            System.out.println("Player 2 has: " + p2.getScore());
        } else {
            System.out.println("It's a tie!");
            System.out.println("Player 1 has: " + p1.getScore());
            System.out.println("Player 2 wins! " + p2.getScore());
        }
    }
}
