package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** Hanterar matcher, turneringar, poäng och visning av spelinformation. */
public class Game {
    private final Map<String, Integer> scores = new HashMap<>();

    public Monster playGame(Monster firstPlayer, Monster secondPlayer) {
        Queue<Monster> turnOrder = new LinkedList<>();

        turnOrder.add(firstPlayer);
        turnOrder.add(secondPlayer);

        while (firstPlayer.isAlive() && secondPlayer.isAlive()) {
            Monster attacker = turnOrder.poll();
            Monster target = getTarget(attacker, firstPlayer, secondPlayer);

            int damage = attacker.attack();
            int remainingHealthPoint = target.takeDamage(damage);

            System.out.println(attacker.getName() + " attackerar "
                    + target.getName() + " och gör " + damage + " skada. "
                    + target.getName() + " har " + remainingHealthPoint + " HP kvar.");

            if (target.isAlive()) {
                // När angriparen läggs sist får motståndaren nästa tur.
                turnOrder.add(attacker);
            }
        }

        Monster winner = getTheWinner(firstPlayer, secondPlayer);
        // Poängen samlas per namn och ökas med tre för varje vunnen match.
        scores.merge(winner.getName(), 3, Integer::sum);
        System.out.println(winner.getName() + " vinner matchen och får 3 poäng!");
        return winner;
    }

    public Monster tournament(List<Monster> monsters) {
        if (monsters.size() < 2) {
            throw new IllegalArgumentException("Turneringen behöver minst två monster.");
        }

        for (Monster monster : monsters) {
            monster.resetHealth();
        }

        // Blandar ordningen så att första motståndaren varierar mellan turneringar.
        Collections.shuffle(monsters);
        Monster champion = monsters.get(0);

        for (int i = 1; i < monsters.size(); i++) {
            Monster challenger = monsters.get(i);
            System.out.println("\n" + champion.getName() + " möter " + challenger.getName() + "!");
            // Vinnaren blir mästare och går vidare till nästa match.
            champion = playGame(champion, challenger);
        }

        return champion;
    }

    public void showMonsters(List<Monster> monsters) {
        for (Monster monster : monsters) {
            System.out.println(monster.getName() + " (" + monster.getClass().getSimpleName()
                    + ") - " + monster.getHealthPoint() + " HP");
        }
    }

    public void showMonsterTypes(List<Monster> monsters) {
        Set<String> monsterTypes = new HashSet<>();
        for (Monster monster : monsters) {
            // Ett Set tar bara med varje typ en gång.
            monsterTypes.add(monster.getClass().getSimpleName());
        }
        System.out.println("Monstertyper: " + monsterTypes);
    }

    public void showLeaderboard() {
        if (scores.isEmpty()) {
            System.out.println("Inga matcher har spelats ännu.");
            return;
        }

        List<Map.Entry<String, Integer>> ranking = new ArrayList<>(scores.entrySet());
        // Sorterar poängen från högst till lägst innan topplistan visas.
        ranking.sort((first, second) -> Integer.compare(second.getValue(), first.getValue()));

        System.out.println("Topplista:");
        for (int i = 0; i < ranking.size(); i++) {
            Map.Entry<String, Integer> entry = ranking.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue() + " poäng");
        }
    }

    public Monster getTheWinner(Monster firstPlayer, Monster secondPlayer) {
        if (firstPlayer.isAlive()) {
            return firstPlayer;
        }
        return secondPlayer;
    }

    public Monster getTarget(Monster attacker, Monster firstPlayer, Monster secondPlayer) {
        Monster target;

        if (attacker == firstPlayer) {
            target = secondPlayer;
        } else {
            target = firstPlayer;
        }

        return target;
    }
}
