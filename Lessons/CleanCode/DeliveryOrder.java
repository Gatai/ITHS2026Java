package Lessons.CleanCode;

/**
 * Beskriver ett leveransuppdrag samt räknar ut priset.
 */
public class DeliveryOrder {
    private static final int PRICE_PER_KILOMETER = 8;
    private static final int DANGEROUS_ROUTE_FEE = 50;

    private final String packageName;
    private final int distanceInKilometers;
    private final boolean dangerousRoute;
    private final int tip;

    /**
     * Skapar ett leveransuppdrag.
     *
     * @param packageName          paketets namn
     * @param distanceInKilometers leveransens sträcka i kilometer
     * @param dangerousRoute       om vägen är farlig
     * @param tip                  extra coins som läggs till priset
     */
    public DeliveryOrder(String packageName, int distanceInKilometers,
            boolean dangerousRoute, int tip) {
        this.packageName = packageName;
        this.distanceInKilometers = distanceInKilometers;
        this.dangerousRoute = dangerousRoute;
        this.tip = tip;
    }

    /** Returnerar paketets namn. */
    public String getPackageName() {
        return packageName;
    }

    /** Returnerar om vägen är farlig. */
    public boolean hasDangerousRoute() {
        return dangerousRoute;
    }

    /**
     * Räknar ut distanskostnad, eventuell avgift för farlig väg samt dricks.
     *
     * @return leveransens totala pris i coins
     */
    public int calculatePrice() {
        int price = distanceInKilometers * PRICE_PER_KILOMETER;

        if (dangerousRoute) {
            price += DANGEROUS_ROUTE_FEE;
        }
        if (tip > 0) {
            price += tip;
        }

        return price;
    }
}
