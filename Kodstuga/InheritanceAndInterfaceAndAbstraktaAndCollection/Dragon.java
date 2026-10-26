package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

import Helper.TerminalColors;

public class Dragon extends Monster implements SpecialAttack {
    private int damage = 10;
    private int specialDamage = 30;

    public Dragon(String name) {
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
