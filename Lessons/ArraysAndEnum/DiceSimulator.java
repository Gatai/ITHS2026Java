package Lessons.ArraysAndEnum;

import java.util.Arrays;

public abstract class DiceSimulator {
    private static int[] dice = { 3, 6, 2, 5, 4 };

    public static void playGame() {
        printDice();
        printSumDice();
        printSortDice();
        printMinAndMaxDice();
        binarySearch();
        expandDiceArray();
    }

    private static void expandDiceArray() {
        System.out.println("-------------- Expand dice array with two extra slots ----------------");

        int[] expandedDice = Arrays.copyOf(dice, dice.length + 2);

        System.out.println("New array length: " + expandedDice.length);

        // Print the new array
        for (int i = 0; i < expandedDice.length; i++) {
            System.out.println("Index " + i + ": " + expandedDice[i]);
        }
    }

    private static void binarySearch() {
        System.out.println("--------------Print binarySearch ----------------");
        // Index blir 4 för att jag har sorterat dice listan innan.
        var myTarget = 6;
        var result = Arrays.binarySearch(dice, myTarget);

        System.out.println("Searching for value " + myTarget + " in the dice array...");
        System.out.println("Found at index: " + result);

        if (result >= 0) {
            System.out.println("Värdet " + myTarget + " hittades på index: " + result);
        } else {
            System.out.println("Värdet " + myTarget + " hittades inte.");
        }
    }

    private static void printMinAndMaxDice() {
        System.out.println("--------------Print out min and max dice number ----------------");

        Arrays.sort(dice);
        int min = dice[0];
        int max = dice[dice.length - 1];

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }

    private static void printDice() {
        System.out.println("--------------Print out all dice number ----------------");
        for (int i = 0; i < dice.length; i++) {
            System.out.println("Dice number: " + dice[i]);
        }
    }

    private static void printSumDice() {
        System.out.println("--------------Print out sum of the dice number ----------------");
        var sum = 0;

        for (int i = 0; i < dice.length; i++) {
            sum += dice[i];
        }
        System.out.println("Sammanlagt poäng: " + sum);
    }

    private static void printSortDice() {
        System.out.println("--------------Print out dice number after Arrays.sort() method ----------------");

        Arrays.sort(dice);

        for (int i = 0; i < dice.length; i++) {
            System.out.println("This is the sorting list of dice: " + dice[i]);

        }
    }
}
