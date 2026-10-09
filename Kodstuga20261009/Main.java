package Kodstuga20261009;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        theFridayMenu();
        // rollerCoaster();
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
