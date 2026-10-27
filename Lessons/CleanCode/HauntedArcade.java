package Lessons.CleanCode;

/**
 * Kör Haunted Arcade-rundorna och visar spelarens resultat.
 */
public class HauntedArcade {
    private static final String PLAYER_NAME = "Nova";
    private static final int STARTING_ENERGY = 70;
    private static final int STARTING_SCORE = 40;
    private static final int FIRST_ROUND_ENERGY_COST = 15;
    private static final int SECOND_ROUND_ENERGY_COST = 20;

    /**
     * Hindrar instanser av klassen, eftersom den bara kör spelet.
     */
    private HauntedArcade() {
    }

    /**
     * Spelar de två rundorna från det ursprungliga scenariot.
     */
    public static void run() {
        ArcadePlayer player = new ArcadePlayer(PLAYER_NAME, STARTING_ENERGY, STARTING_SCORE);

        playRound(player, FIRST_ROUND_ENERGY_COST, true);
        playRound(player, SECOND_ROUND_ENERGY_COST, false);
    }

    /**
     * Använder energi och lägger till poäng för en runda, och visar sedan status.
     *
     * @param player spelaren som deltar i rundan
     * @param energyCost energin som används under rundan
     * @param earnedBonus om spelaren får den större poängbelöningen
     */
    private static void playRound(ArcadePlayer player, int energyCost, boolean earnedBonus) {
        player.completeRound(energyCost, earnedBonus);
        printRoundResult(player);
    }

    /**
     * Skriver ut bonusmeddelandet om rummet är upplåst och spelarens status.
     *
     * @param player spelaren vars status visas
     */
    private static void printRoundResult(ArcadePlayer player) {
        if (player.hasUnlockedBonusRoom()) {
            System.out.println("BONUS ROOM UNLOCKED!");
        }

        System.out.println(player.getName()
                + " | energy=" + player.getEnergy()
                + " | score=" + player.getScore());
    }
}
