package Kodstuga.ArraysAndEnum;

public abstract class TreasureCalculator {
    private static int[] golds = { 10, 20, 50, 70, 30 }; // 180

    public static void startTreasureCalculator() {

        System.out.println("-----------------Total gold -------------------");

        var total = calculateGold(golds);
        System.out.println("Total gold amount: " + total);

        System.out.println("-----------------largest -------------------");

        var largest = findLargestChest(golds);
        System.out.println("Largest gold amount in a chest: " + largest);

    }

    private static int calculateGold(int[] values) {
        int total = 0;

        for (int gold : values) {
            total += gold;
        }

        return total;
    }

    private static int findLargestChest(int[] values) {
        int largest = golds[0];

        for (int gold : values) {
            if (gold > largest) {
                largest = gold;
            }
        }
        return largest;
    }
}
