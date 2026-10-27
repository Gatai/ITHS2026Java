package Lessons.CleanCode;

/**
 * Representerar en spelare med namn, hälsa och coins samt regler för potionköp och läkning.
 */
public class Player {
    /** Högsta tillåtna hälsovärde för en spelare. */
    private static final int MAX_HEALTH = 100;

    private final String name;
    private int health;
    private int coins;

    /**
     * Skapar en spelare med startvärden och kontrollerar att de är giltiga.
     *
     * @param name spelarens namn, får inte vara tomt
     * @param health spelarens hälsa, från 0 till 100
     * @param coins spelarens coins, måste vara 0 eller fler
     * @throws IllegalArgumentException om något startvärde är ogiltigt
     */
    public Player(String name, int health, int coins) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Spelaren måste ha ett namn.");
        }
        if (health < 0 || health > MAX_HEALTH) {
            throw new IllegalArgumentException("Hälsan måste vara mellan 0 och 100.");
        }
        if (coins < 0) {
            throw new IllegalArgumentException("Antalet coins kan inte vara negativt.");
        }

        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    /**
     * Kontrollerar om spelaren har råd med en potion till angivet pris.
     *
     * @param price potionens pris; negativa priser räknas inte som köpbara
     * @return {@code true} om priset är giltigt och spelaren har tillräckligt med coins
     */
    public boolean canBuyPotion(int price) {
        return price >= 0 && coins >= price;
    }

    /**
     * Köper en potion genom att dra priset från spelarens coins.
     *
     * @param price potionens pris
     * @return {@code true} om köpet genomfördes, annars {@code false}
     */
    public boolean buyPotion(int price) {
        if (!canBuyPotion(price)) {
            return false;
        }

        coins -= price;
        return true;
    }

    /**
     * Höjer spelarens hälsa utan att låta den överstiga maxhälsan.
     *
     * @param amount mängden hälsa som ska återställas
     * @throws IllegalArgumentException om mängden är negativ
     */
    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Läkningsmängden kan inte vara negativ.");
        }

        health = Math.min(health + amount, MAX_HEALTH);
    }

    /** Skriver ut spelarens namn, hälsa och coins. */
    public void printStatus() {
        System.out.println(name + " - Health: " + health + ", Coins: " + coins);
    }
}
