package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public class Slime extends Monster {
    private int damage = 15;

    public Slime(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return damage;
    }

}
