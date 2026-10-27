package Lessons.CleanCode;

/**
 * Håller reda på Haunted Arcade-spelarens namn, energi och poäng.
 */
public class ArcadePlayer {

    @SuppressWarnings("unused") // Tystnar komplingensfel
    private static final int MAX_ENERGY = 100;
    private static final int BONUS_SCORE_REWARD = 50;
    private static final int REGULAR_SCORE_REWARD = 10;
    private static final int BONUS_ROOM_SCORE = 100;

    private final String name;
    private int energy;
    private int score;

    /**
     * Skapar en spelare med angivna startvärden.
     *
     * @param name   spelarens namn
     * @param energy spelarens startenergi
     * @param score  spelarens startpoäng
     */
    public ArcadePlayer(String name, int energy, int score) {
        this.name = name;
        this.energy = energy;
        this.score = score;
    }

    /**
     * Drar rundans energikostnad och lägger till poängbelöningen.
     *
     * @param energyCost  energin som används under rundan
     * @param earnedBonus om den större poängbelöningen ska ges
     */
    public void completeRound(int energyCost, boolean earnedBonus) {
        energy = Math.max(0, energy - energyCost);
        score += earnedBonus ? BONUS_SCORE_REWARD : REGULAR_SCORE_REWARD;
    }

    /** Returnerar spelarens namn. */
    public String getName() {
        return name;
    }

    /** Returnerar spelarens nuvarande energi. */
    public int getEnergy() {
        return energy;
    }

    /** Returnerar spelarens nuvarande poäng. */
    public int getScore() {
        return score;
    }

    /** Kontrollerar om spelarens poäng räcker för att låsa upp bonusrummet. */
    public boolean hasUnlockedBonusRoom() {
        return score >= BONUS_ROOM_SCORE;
    }
}
