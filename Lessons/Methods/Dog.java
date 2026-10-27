package Lessons.Methods;

import java.util.Random;

public class Dog {
    private boolean isHunger;

    public Dog() {
        Random ran = new Random();
        isHunger = ran.nextBoolean();
    }

    public void showHunger() {

        for (int i = 0; i < 5; i++) {
            System.out.println("The loop nr is: " + i);
            if (isHunger) {
                System.out.println("The dog is hunger: " + isHunger);
                eat();
                System.out.println("The dog full now!");
            } else {
                System.out.println("The dog is not hunger: " + isHunger);
            }

            i++;
        }
    }

    private boolean eat() {
        System.out.println("The dog is eating....");
        return isHunger = false;
    }
}
