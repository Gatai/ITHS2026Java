package Lessons.Exceptions;

import Helper.TerminalColors;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Skattkistan som kraschar
        // theTreasureChest();

        // 2. Den säkra miniräknaren
        // 3. Finally - städpatrullen
        // theCalculator();

        // 4. Poängvakten
        // try {
        // thePointGuard(50); // Giltig poäng
        // thePointGuard(120); // Ogiltig poäng
        // } catch (IllegalArgumentException e) {
        // // Fångar felet som poängvakten kastar.
        // System.out.println("Felaktig poäng: " + e.getMessage());
        // }

        // Bonus - Exceptiondetektiven
        // theExceptionDetective();

        // Gruppövning: undersök incidenterna och spela en runda.
        investigateIncidents();
        try (Scanner scanner = new Scanner(System.in)) {
            startGame(scanner);
        }
    }

    @SuppressWarnings("unused") // Tystnar komplingensfel
    private static void thePointGuard(int score) {
        // Poängen måste ligga mellan 0 och 100.
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Poängen måste vara mellan 0 och 100.");
        }

        System.out.println("Poängen " + score + " godkändes.");
    }

    @SuppressWarnings("unused") // Tystnar komplingensfel
    private static void theExceptionDetective() {
        int age = 20; // Korrekt kod.

        // Kompileringsfel: Java upptäcker division med konstanten 0 redan vid
        // kompilering.
        // int number = 10 / 0;

        int[] values = new int[3]; // Korrekt kod: indexen är 0, 1 och 2.

        try {
            System.out.println(values[3]); // Körningsfel: index 3 finns inte i arrayen.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Körningsfel fångat: " + e.getMessage());
        }

        double price = 19.95; // Korrekt kod.
    }

    private static void investigateIncidents() {
        System.out.println("\n--- Exception Escape Room: incidenter ---");

        // Incident A: int energy = 7.5; ger kompileringsfel eftersom ett decimaltal
        // inte kan tilldelas direkt till en int.
        System.out.println("Incident A: int energy = 7.5; ger kompileringsfel.");

        // Incident B: index 5 finns inte i en array med tre element.
        int[] doors = { 1, 2, 3 };
        try {
            System.out.println("Dörr: " + doors[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incident B: Ogiltigt arrayindex: " + e.getMessage());
        }

        // Incident C: kontrollera null innan värdet används.
        String playerName = null;
        if (playerName == null) {
            System.out.println("Incident C: Spelarnamnet saknas.");
        } else {
            System.out.println("Spelarens namn har " + playerName.length() + " tecken.");
        }

        investigateSaveFile();
    }

    private static void investigateSaveFile() {
        // try-with-resources stänger filen automatiskt, även om något går fel.
        try (Scanner saveFile = new Scanner(new File("savegame.txt"))) {
            if (saveFile.hasNextLine()) {
                System.out.println("Incident D: " + saveFile.nextLine());
            } else {
                System.out.println("Incident D: Save-filen är tom.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incident D: Save-filen kunde inte hittas.");
        }
    }

    private static void startGame(Scanner scanner) {
        System.out.println("\n--- Minispel: välj en dörr ---");
        // Anropskedjan vidare är startGame -> playRound -> validateChoice.
        playRound(scanner);
    }

    private static void playRound(Scanner scanner) {
        try {
            System.out.println("Välj dörr 1 (skatt) eller 2 (utgång):");
            int choice = scanner.nextInt();
            validateChoice(choice);

            if (choice == 1) {
                System.out.println("Du hittade skatten!");
            } else {
                System.out.println("Du hittade utgången. Spelet är räddat!");
            }
        } catch (InputMismatchException e) {
            // nextInt kräver ett heltal. Ta bort den felaktiga inmatningen.
            scanner.nextLine();
            System.out.println("Skriv ett heltal: 1 eller 2.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ogiltigt val: " + e.getMessage());
        } finally {
            System.out.println("Spelrundan är avslutad.");
        }
    }

    private static void validateChoice(int choice) {
        if (choice < 1 || choice > 2) {
            throw new IllegalArgumentException("Välj dörr 1 eller 2.");
        }
    }

    @SuppressWarnings("unused") // Tystnar komplingensfel
    private static void theCalculator() {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Skriv det första heltalet: ");
                int firstNumber = scanner.nextInt();

                System.out.print("Skriv det andra heltalet: ");
                int secondNumber = scanner.nextInt();

                int result = firstNumber / secondNumber;
                System.out.println("Resultat: " + result);
            } catch (ArithmeticException e) {
                // Heltalsdivision med noll orsakar ArithmeticException.
                System.out.println("Det går inte att dividera med noll.");
            } catch (InputMismatchException e) {
                // nextInt kräver ett heltal; text eller decimaltal orsakar detta fel.
                System.out.println("Fel inmatning. Skriv två heltal.");
            } finally {
                System.out.println("Programmet är klart.");
            }
        }
    }

    @SuppressWarnings("unused") // Tystnar komplingensfel
    private static void theTreasureChest() {
        int[] treasure = { 100, 200, 300 };
        try {
            System.out.println(treasure[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

            System.out.println("Nedan kommer stack trace" + TerminalColors.MONSTER);
            e.printStackTrace();
        }
    }
}
