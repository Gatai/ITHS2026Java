package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

/** Ett monster med enbart vanlig attack. */
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
