package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public class Dragon extends Monster implements SpecialAttack {
    private int damage = 10;
    private int specialDamage = 30;

    public Dragon(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public int useSpecialAttack() {
        return specialDamage;
    }
}
