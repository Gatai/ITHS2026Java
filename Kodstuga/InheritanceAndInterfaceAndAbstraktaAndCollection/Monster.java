package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public abstract class Monster {
    protected String name;
    protected int healthPoint;

    public Monster(String name) {
        this.name = name;
        // this.healthPoint = new Random().nextInt(100) + 1; // Alla moster får olika HP
        // värde.
        this.healthPoint = 100;
    }

    public abstract int attack();

    public String getName() {
        return name;
    }

    public int takeDamage(int damage) {
        int newHealthPoint = healthPoint - damage;

        if (newHealthPoint <= 0) {
            healthPoint = 0;
        } else {
            healthPoint = newHealthPoint;
        }
        return healthPoint;
    }

    public boolean isAlive() {
        if (healthPoint <= 0) {
            return false;
        }
        return true;
    }
}
