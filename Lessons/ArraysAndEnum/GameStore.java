package Lessons.ArraysAndEnum;

public abstract class GameStore {

    // A list for all methods in this class.
    private static String[] items = { "Kaffe", "Mobil", "Nycklar", "Anteckningsbok", "Penna" };

    // Skapa en String[] med fem valfria föremål, exempelvis svärd, sköld och
    // potion.
    // Skriv ut det första och sista föremålet med hjälp av index.
    public static void printFistAndLastInArrayItem() {
        System.out.println("First item in array: " + items[0] + " \nLast item in arrya " + items[4]);
    }

    // Byt ut det tredje föremålet mot något bättre.
    public static void printTheThirdItemWithSomethingElse() {
        String oldItem = items[2]; // spara gamla värdet

        items[2] = "New Item"; // byt ut tredje föremålet

        System.out.println("Changed item at index 2 from \""
                + oldItem + "\" to \"" + items[2] + "\".");
    }

    public static void printTheLengthOfTheArray() {
        // Skriv ut längden på arrayen
        System.out.println("Length of the array:y " + items.length);

        // Skriv ut alla värden i arrayen, ett per rad
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
