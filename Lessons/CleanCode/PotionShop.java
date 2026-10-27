package Lessons.CleanCode;

/**
 * Demonstrerar ett enkelt potionköp och hur potionen påverkar spelarens status.
 */
public class PotionShop {
    /** Pris för en potion i coins. */
    private static final int POTION_PRICE = 30;

    /** Hälsan som en potion återställer. */
    private static final int POTION_HEAL_AMOUNT = 25;

    /** Hindrar att butiksdemonstrationen skapas som ett objekt. */
    private PotionShop() {
    }

    /** Skapar en spelare och visar status före och efter ett potionköp. */
    public static void run() {
        Player player = new Player("Mira", 60, 100);

        System.out.println("\n--- Potion Shop ---");
        System.out.println("Före köpet:");
        player.printStatus();

        if (player.canBuyPotion(POTION_PRICE) && player.buyPotion(POTION_PRICE)) {
            System.out.println("Köpet lyckades. Potionen kostade " + POTION_PRICE + " coins.");
            player.heal(POTION_HEAL_AMOUNT);
        } else {
            System.out.println("Du har inte tillräckligt med coins för en potion.");
        }

        System.out.println("Efter köpet:");
        player.printStatus();
    }
}
