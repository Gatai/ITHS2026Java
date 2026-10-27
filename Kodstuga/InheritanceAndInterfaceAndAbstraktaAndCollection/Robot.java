package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

import Helper.TerminalColors;

/** Ett robotmonster som kan använda både vanlig attack och specialattack. */
public class Robot extends Monster implements SpecialAttack {
    private int damage = 20;
    private int specialDamage = 30;

    public Robot(String name) {
        super(name);
    }

    @Override
    public int attack() {
        boolean useSpecial = Math.random() < 0.5;

        if (useSpecial) {
            return useSpecialAttack();
        }
        return damage;
    }

    @Override
    public int useSpecialAttack() {
        System.out.println(TerminalColors.MONSTER + getName() + " använder en specialattack!" + TerminalColors.RESET);
        return specialDamage;
    }

}
