package Lessons.ArraysAndEnum;

public abstract class TreasureMap {
    // Creating the map 3X3
    private static int[][] map = new int[3][3];

    public static void printTreasureMap() {

        // Place the treasure value 1, at any chosen position
        map[1][2] = 1; // row 1, colum 2

        // Print the original map layout
        System.out.println("Original treasure map: ");
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }
            System.out.println();
        }

        // Bonus: Move the treasure by updating two positions
        map[1][2] = 0; // remove treasure from old position
        map[0][0] = 1; // place treasure at new position

        // Print the updated map layout
        System.out.println("\nTreasure map after moving the treasure:");
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.print(map[row][col] + " ");
            }
            System.out.println();
        }
    }
}
