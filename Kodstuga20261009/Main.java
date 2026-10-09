package Kodstuga20261009;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        rollerCoaster();
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
