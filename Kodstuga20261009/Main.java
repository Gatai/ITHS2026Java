package Kodstuga20261009;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("Goblin");
        pet.start();

        /*
         * Monster Arena
         * Monster goblin = new Monster("Goblin", 30);
         * goblin.fight(); // all logik ligger i klassen
         */

        /*
         * Build your own animal
         * Animal dog = new Animal("Bamse", 3, "Woof!");
         * Animal cat = new Animal("Misse", 2, "Meow!");
         * 
         * dog.makeSound();
         * cat.makeSound();
         */

        // rocketLaunch(); // for-loop och continue
        // theFridayMenu(); // switch, case, break
        // rollerCoaster(); // if / else if / else
    }

    public static class Pet {
        private String name;
        private int hunger;
        private int energy;

        Random ran = new Random();

        Pet(String name) {
            this.name = name;
            this.hunger = ran.nextInt(11);
            this.energy = ran.nextInt(50); // 0-49
        }

        private void eat() {
            hunger = hunger - 3; // Det är samma hunger -= 3;
            if (hunger < 0) { // Det går att skriva hunger = Math.max(0, hunger - 3); använda metoden max().
                hunger = 0;
            }
            System.out.println(name + " eats. Hunger: " + hunger);
        }

        private void play() {
            if (energy <= 3) {
                System.out.println(name + " is too tired to play.");
                return;
            }

            energy = energy - 3; // energy -= 3;
            hunger = hunger + 3; // hunger += 2;

            System.out.println("-------------------------Playing-----------------------------------");
            System.out.println(name + " plays! Energy: " + energy + ", Hunger: " + hunger);
            System.out.println("-------------------------End Playing-------------------------------");

            if (hunger >= 12) {
                System.out.println(name + " complains: I'm hungry!");
            }
        }

        private void status() {
            System.out.println("-------------------------Status-----------------------------------");
            System.out.println("Pet: " + name + " | Hunger: " + hunger + " | Energy: " + energy);
            System.out.println("-------------------------End status-------------------------------");

        }

        // vill anropa denna metoden i main.
        public void start() {

            for (int i = 0; i < 10; i++) {
                status();
                play();
                eat();
                play();
                status();
            }
        }
    }

    public static class Monster {
        String name;
        int health;

        Monster(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public void fight() {
            int round = 1;

            while (health > 0) {
                System.out.println("Round " + round);
                takeDamage(7);
                round++;
            }

            System.out.println(name + " has been defeated!");
        }

        public void takeDamage(int amount) {
            health -= amount;
            System.out.println(name + " takes " + amount + " damage. Health: " + health);
        }
    }

    public static class Animal {

        // Fields
        String name;
        int age;
        String sound;

        // Constructor
        public Animal(String name, int age, String sound) {
            this.name = name;
            this.age = age;
            this.sound = sound;
        }

        // Method
        public void makeSound() {
            System.out.println(name + " says: " + sound);
        }
    }

    public static void rocketLaunch() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("LIFTOFF");
    }

    public static void theFridayMenu() {
        Random random = new Random();
        int choice = random.nextInt(6);

        System.out.println("Friday menu:");
        System.out.println("1. Chicken pasta bake");
        System.out.println("2. Pancakes");
        System.out.println("3. Tacos");
        System.out.println("4. Tomato soup");
        System.out.println("5. Pizza");
        System.out.println();
        System.out.println("Randomly selected number: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Chicken pasta bake recipe:");
                System.out.println(
                        "Mix cooked pasta with chicken, tomato sauce and cheese. Bake at 200 C for 20 minutes.");
                break;
            case 2:
                System.out.println("Pancake recipe:");
                System.out.println(
                        "Whisk flour, milk and eggs into a batter. Fry thin pancakes in a lightly buttered pan.");
                break;
            case 3:
                System.out.println("Taco recipe:");
                System.out
                        .println("Cook seasoned minced meat and serve in taco shells with lettuce, cheese and salsa.");
                break;
            case 4:
                System.out.println("Tomato soup recipe:");
                System.out.println("Simmer crushed tomatoes with stock and seasoning, then blend until smooth.");
                break;
            case 5:
                System.out.println("Pizza recipe:");
                System.out.println("Top pizza dough with tomato sauce and cheese. Bake at 220 C until golden.");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void rollerCoaster() {
        int age;
        double length;

        Random random = new Random();
        age = random.nextInt(60);

        length = random.nextDouble(200);

        if (length < 90) {
            System.out.println("Sorry, You can not go on a roller coaster!");
            ;
        } else if (length < 90 && age < 3) {
            System.out.println("You need to have a parent to rike with!");

        } else {
            System.out.println("yeah, You can go on a roller coaster!");
        }
    }

}
