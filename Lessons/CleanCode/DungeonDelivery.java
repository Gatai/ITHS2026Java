package Lessons.CleanCode;

/**
 * Kör leveranser samt skriver ut kvitton.
 */
public class DungeonDelivery {
    private static final int STARTING_HEALTH = 100;
    private static final int STARTING_COINS = 180;
    private static final int DANGEROUS_ROUTE_DAMAGE = 20;

    /** Hindrar objekt av klassen eftersom den bara kör demonstrationen. */
    private DungeonDelivery() {
    }

    /**
     * Kör den obligatoriska farliga leveransen samt en extra säker leverans.
     */
    public static void run() {
        System.out.println("\n=== Dungeon Delivery ===");

        Courier courier = new Courier("Mira", STARTING_HEALTH, STARTING_COINS);
        DeliveryOrder dangerousDelivery = new DeliveryOrder("Mystisk kista", 8, true, 10);
        completeDelivery(courier, dangerousDelivery);

        Courier safeRouteCourier = new Courier("Alex", STARTING_HEALTH, STARTING_COINS);
        DeliveryOrder safeDelivery = new DeliveryOrder("Örtpåse", 2, false, 0);
        completeDelivery(safeRouteCourier, safeDelivery);
    }

    /**
     * Genomför uppdraget om budet har råd och skriver sedan ut kvittot.
     *
     * @param courier budet som utför leveransen
     * @param order   leveransens detaljer
     */
    private static void completeDelivery(Courier courier, DeliveryOrder order) {
        int price = order.calculatePrice();

        if (!courier.canAfford(price)) {
            System.out.println(courier.getName() + " har inte råd med leveransen.");
            return;
        }

        courier.pay(price);
        if (order.hasDangerousRoute()) {
            courier.takeDamage(DANGEROUS_ROUTE_DAMAGE);
        }

        printReceipt(courier, order, price);
    }

    /**
     * Skriver ut leveransens detaljer samt budets återstående status.
     *
     * @param courier budet som genomförde leveransen
     * @param order   det genomförda leveransuppdraget
     * @param price   priset som betalades
     */
    private static void printReceipt(Courier courier, DeliveryOrder order, int price) {
        System.out.println("=== Leverans klar ===");
        System.out.println("Bud: " + courier.getName());
        System.out.println("Paket: " + order.getPackageName());
        System.out.println("Pris: " + price + " coins");
        System.out.println("HP kvar: " + courier.getHealth());
        System.out.println("Coins kvar: " + courier.getCoins());
    }
}
