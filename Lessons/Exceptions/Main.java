package Lessons.Exceptions;

import Helper.TerminalColors;
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
        theExceptionDetective();
    }

    private static void thePointGuard(int score) {
        // Poängen måste ligga mellan 0 och 100.
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Poängen måste vara mellan 0 och 100.");
        }

        System.out.println("Poängen " + score + " godkändes.");
    }

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
