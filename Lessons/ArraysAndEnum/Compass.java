package Lessons.ArraysAndEnum;

import java.util.Random;

public abstract class Compass {
    private enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public static void printDirection() {
        Random ran = new Random();

        for (int i = 0; i < 6; i++) {
            Direction dir = Direction.values()[ran.nextInt(Direction.values().length)];

            // Print message based on direction
            switch (dir) {
                case NORTH:
                    System.out.println("You walk north into the cold mountains.");
                    break;
                case EAST:
                    System.out.println("You head east toward the rising sun.");
                    break;
                case SOUTH:
                    System.out.println("You travel south into the warm desert.");
                    break;
                case WEST:
                    System.out.println("You move west toward the deep forest.");
                    break;
            }
            System.out.println("Random direction: " + dir);
            System.out.println("-------------------------");
        }
        // Print all possible directions once
        System.out.println("All available directions:");
        for (Direction d : Direction.values()) {
            System.out.println("- " + d);
        }
    }

}
