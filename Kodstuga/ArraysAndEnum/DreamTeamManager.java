package Kodstuga.ArraysAndEnum;

public class DreamTeamManager {
    // String array with five players
    private static String[] players = { "Alex", "Maria", "John", "Sofia", "Liam" };

    public static void startDreamTeam() {
        DreamTeamManager.printFirstAndLastPlayer();
        DreamTeamManager.replacePlayer(2, "Oliver");
        DreamTeamManager.printAllPlayers();
        DreamTeamManager.printTeamSize();
        DreamTeamManager.printAllPlayersEnhanced();
    }

    // Print first and last player
    public static void printFirstAndLastPlayer() {
        System.out.println("First player: " + players[0]);
        System.out.println("Last player: " + players[players.length - 1]);
    }

    // Replace one player with another
    public static void replacePlayer(int index, String newName) {
        players[index] = newName;
        System.out.println("Player at index " + index + " replaced with: " + newName);
    }

    // Print all players using a normal for-loop
    public static void printAllPlayers() {
        System.out.println("All players (normal loop):");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }

    // Print team size
    public static void printTeamSize() {
        System.out.println("Team size: " + players.length);
    }

    // Extra: Print all players using enhanced for-loop
    public static void printAllPlayersEnhanced() {
        System.out.println("All players (enhanced loop):");
        for (String player : players) {
            System.out.println(player);
        }
    }
}
