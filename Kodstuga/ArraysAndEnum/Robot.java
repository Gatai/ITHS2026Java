package Kodstuga.ArraysAndEnum;

public abstract class Robot {

    public static void startRobot() {
        // Övning 1 – Hälsa på din robot!
        greet("Alex");
        greet("Maria");
        greet("Ann");
        printFavoriteNumber(); // main stays clean
    }

    // Method that takes a String and prints a greeting
    private static void greet(String name) {
        System.out.println("Hello " + name + "! I am your robot!");
    }

    // Method that prints the robot's favorite number
    private static void printFavoriteNumber() {
        int number = getFavoriteNumber();
        System.out.println("My favorite number is: " + number);
    }

    // Method that returns the robot's favorite number
    private static int getFavoriteNumber() {
        return 42; // or any number you want
    }
}
