package Lessons.Methods;

public class Game {
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
