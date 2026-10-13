package Lessons.Methods;

public abstract class Fighter {
    private final String name; // man ska inte kunna ändra namn.
    private int health;

    protected Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack(Fighter target);

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

}
