package Lessons.CleanCode;

/**
 * Håller reda på budets status.
 */
public class Courier {
    private final String name;
    private int health;
    private int coins;

    /**
     * Skapar ett bud med angiven startstatus.
     *
     * @param name budets namn
     * @param health budets start-hälsa
     * @param coins budets startcoins
     */
    public Courier(String name, int health, int coins) {
        this.name = name;
        this.health = health;
        this.coins = coins;
    }

    /** Returnerar budets namn. */
    public String getName() {
        return name;
    }

    /** Returnerar budets nuvarande hälsa. */
    public int getHealth() {
        return health;
    }

    /** Returnerar budets nuvarande coins. */
    public int getCoins() {
        return coins;
    }

    /**
     * Kontrollerar om budet har råd med leveransen.
     *
     * @param price leveransens pris
     * @return true om budet har tillräckligt med coins
     */
    public boolean canAfford(int price) {
        return coins >= price;
    }

    /**
     * Drar leveransens pris från budets coins.
     *
     * @param price beloppet som ska dras
     */
    public void pay(int price) {
        coins -= price;
    }

    /**
     * Minskar hälsan utan att låta den gå under noll.
     *
     * @param damage mängden hälsa som ska tas bort
     */
    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }
}
