package Kodstuga.ArraysAndEnum;

public abstract class SuperpowerGame {
    public enum SuperPower {
        FIRE,
        ICE,
        WIND,
        LIGHTNING
    }

    public static void startGame() {
        // Player's chosen superpower
        SuperPower playerPower = SuperPower.LIGHTNING;

        // Switch based on chosen superpower
        switch (playerPower) {
            case FIRE:
                System.out.println("You chose FIRE! Burn everything in your way!");
                break;
            case ICE:
                System.out.println("You chose ICE! Freeze your enemies solid!");
                break;
            case WIND:
                System.out.println("You chose WIND! Control the storms!");
                break;
            case LIGHTNING:
                System.out.println("You chose LIGHTNING! Strike with electric fury!");
                break;
        }

        // Extra challenge: print all available superpowers
        System.out.println("\nAvailable superpowers:");
        for (SuperPower power : SuperPower.values()) {
            System.out.println("- " + power);
        }
    }
}
