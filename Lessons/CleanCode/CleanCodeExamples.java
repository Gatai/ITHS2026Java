package Lessons.CleanCode;

/**
 * Visar grundläggande Clean Code-principer med namn, konstanter och små metoder.
 */
public class CleanCodeExamples {
    /** Poängen som krävs för att gå upp en nivå. */
    private static final int LEVEL_UP_SCORE = 100;

    /** Kostnaden för en potion i köpberäkningsexemplet. */
    private static final int POTION_PRICE = 30;

    /** Hindrar att den här klassen skapas eftersom den bara innehåller statiska exempel. */
    private CleanCodeExamples() {
    }

    /** Kör exemplen för tydliga namn, namngivna konstanter och små metoder. */
    public static void run() {
        demonstrateMeaningfulNames();
        demonstrateNamedConstant();
        demonstrateSmallMethods();
    }

    /** Skriver ut ett köp med variabelnamn som tydligt beskriver värdena. */
    private static void demonstrateMeaningfulNames() {
        String customerName = "Mira";
        int numberOfDrinks = 3;
        double pricePerDrink = 30.0;
        double totalCost = numberOfDrinks * pricePerDrink;

        System.out.println(customerName + " köper drycker för " + totalCost + " kr.");
    }

    /** Visar hur en namngiven konstant förklarar gränsen för att gå upp en nivå. */
    private static void demonstrateNamedConstant() {
        int playerScore = 120;

        if (playerScore >= LEVEL_UP_SCORE) {
            System.out.println("Level up!");
        }
    }

    /** Beräknar ett exempelköp och skriver ut om spelaren har råd. */
    private static void demonstrateSmallMethods() {
        int coins = 100;
        int numberOfPotions = 2;
        int totalCost = calculatePotionCost(numberOfPotions);

        printPurchaseResult(coins, totalCost);
    }

    /**
     * Räknar ut den sammanlagda kostnaden för potionerna.
     *
     * @param numberOfPotions antal potions som ska köpas
     * @return kostnaden i coins
     */
    private static int calculatePotionCost(int numberOfPotions) {
        return numberOfPotions * POTION_PRICE;
    }

    /**
     * Skriver ut om ett köp lyckas utifrån spelarens coins och kostnaden.
     *
     * @param availableCoins spelarens tillgängliga coins
     * @param totalCost köpets totala kostnad
     */
    private static void printPurchaseResult(int availableCoins, int totalCost) {
        if (availableCoins >= totalCost) {
            System.out.println("Köpet lyckades. Kostnad: " + totalCost + " coins.");
        } else {
            System.out.println("Du har inte tillräckligt med coins.");
        }
    }
}
