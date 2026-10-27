package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    public Monster playGame(Monster firstPlayer, Monster secondPlayer) {
        Queue<Monster> turnOrder = new LinkedList<>(); // Ordningen på monster player 1 och sedan player 2.

        turnOrder.add(firstPlayer);
        turnOrder.add(secondPlayer);

        while (firstPlayer.isAlive() && secondPlayer.isAlive()) {
            Monster attacker = turnOrder.poll(); // tar ut det första elementet i kön – och tar bort det från kön.
            Monster target = getTarget(attacker, firstPlayer, secondPlayer);

            int damage = attacker.attack();
            int remainingHealthPoint = target.takeDamage(damage);

            System.out.println(attacker.getName() + " attackerar "
                    + target.getName() + " och gör " + damage + " skada. "
                    + target.getName() + " har " + remainingHealthPoint + " HP kvar.");

            if (target.isAlive()) { // om target lever lägg till sist i kön;
                turnOrder.add(attacker);
            }
        }

        return getTheWinner(firstPlayer, secondPlayer);
    }

    public List<Monster> tournament(List<Monster> monsters) {

        return monsters;
    }

    // Get the winner
    public Monster getTheWinner(Monster firstPlay, Monster secondPlayer) {
        if (firstPlay.isAlive()) {
            return firstPlay;
        }
        return secondPlayer;
    }

    // Get the target
    public Monster getTarget(Monster attacker, Monster firstPlay, Monster secondPlayer) {
        Monster target;

        if (attacker == firstPlay) {
            target = secondPlayer;
        } else {
            target = firstPlay;
        }

        return target;
    }
}
