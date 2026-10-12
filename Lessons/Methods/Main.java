package Lessons.Methods;

public class Main {
    public static void main(String[] args) {

        /*
         * Övning 1 – Hälsningsroboten
         * Robot robot = new Robot();
         * robot.greet();
         */

        /*
         * Övning 2 – Pizzakalkylatorn
         * PizzaCalculator pizza = new PizzaCalculator(2, 10);
         * pizza.printPizza();
         */

        /*
         * Övning 4 – Den hungriga hunden
         * Dog dog = new Dog();
         * dog.showHunger();
         */

        /*
         * Övning 5 – Hemlig highscore
         */

        for (int i = 0; i < 5; i++) {
            Player p1 = new Player();
            Player p2 = new Player();
            Game.determineWinner(p1, p2);
            System.out.println("------------------Next game-------------");
            i++;
        }
    }
}
