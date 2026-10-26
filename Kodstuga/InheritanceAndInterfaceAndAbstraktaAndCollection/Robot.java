package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public class Robot extends Monster implements SpecialAttack {
    private int damage = 20;
    private int specialDamage = 30;

    public Robot(String name) {
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
