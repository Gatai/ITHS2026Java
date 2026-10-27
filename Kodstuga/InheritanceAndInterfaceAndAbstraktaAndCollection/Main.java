package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Detta kapitel var svår!!!
/** Startar spelet, skapar arenan och hanterar spelarens menyval. */
public class Main {
    public static void main(String[] args) {
        List<Monster> arena = new ArrayList<>();
        arena.add(new Dragon("Draggg"));
        arena.add(new Robot("Rooobooot"));
        arena.add(new Slime("Slimmmee"));

        Game game = new Game();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n1. Visa alla monster");
                System.out.println("2. Starta en turnering");
                System.out.println("3. Visa topplistan");
                System.out.println("4. Visa monstertyper");
                System.out.println("5. Avsluta");
                System.out.print("Välj: ");

                if (!scanner.hasNextLine()) {
                    break;
                }

                String choice = scanner.nextLine().trim();
                switch (choice) {
                    case "1":
                        game.showMonsters(arena);
                        break;
                    case "2":
                        Monster winner = game.tournament(arena);
                        System.out.println("Turneringens vinnare: " + winner.getName());
                        break;
                    case "3":
                        game.showLeaderboard();
                        break;
                    case "4":
                        game.showMonsterTypes(arena);
                        break;
                    case "5":
                        running = false;
                        System.out.println("Spelet avslutas.");
                        break;
                    default:
                        System.out.println("Ogiltigt val. Välj mellan 1 och 5.");
                }
            }
        }
    }
}
