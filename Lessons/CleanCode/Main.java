package Lessons.CleanCode;

/**
 * Startar Clean Code-exemplen samt Potion Shop-demonstrationen.
 */
public class Main {
    /**
     * Kör exemplen i den ordning de ska visas.
     *
     * @param args kommandoradsargument som inte används
     */
    public static void main(String[] args) {
        CleanCodeExamples.run();
        PotionShop.run();

        // Spicy uppgift
        DungeonDelivery.run();
    }
}
