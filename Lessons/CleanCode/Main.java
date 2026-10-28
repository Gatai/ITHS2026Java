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
        // Clean Code
        CleanCodeExamples.run();

        // 4. Mini-projekt - Potion Shop
        PotionShop.run();

        // Spicy uppgift
        DungeonDelivery.run();

        // GRuppuppgift
        HauntedArcade.run();
    }
}
