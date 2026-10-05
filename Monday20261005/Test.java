package Monday20261005;
import java.util.Scanner;

public class Test {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nVälj en övning:");
            System.out.println("1. Scope");
            System.out.println("2. If (tal > 10)");
            System.out.println("3. If/Else (18 år)");
            System.out.println("4. Else/If (litet, mellan, stort tal)");
            System.out.println("5. Switch (1–3)");
            System.out.println("6. While (1–5)");
            System.out.println("7. Do-While (minst en gång)");
            System.out.println("8. For-loop (1–10)");
            System.out.println("9. Break");
            System.out.println("10. Continue");
            System.out.println("0. Avsluta");

            System.out.print("Ditt val: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> scopeExercise();
                case 2 -> ifExercise();
                case 3 -> ifElseExercise();
                case 4 -> elseIfExercise();
                case 5 -> switchExercise();
                case 6 -> whileExercise();
                case 7 -> doWhileExercise();
                case 8 -> forLoopExercise();
                case 9 -> breakExercise();
                case 10 -> continueExercise();
                case 0 -> {
                    System.out.println("Programmet avslutas.");
                    return;
                }
                default -> System.out.println("Ogiltigt val.");
            }
        }
    }

    // ---------------- ÖVNINGAR ----------------

    static void scopeExercise() {
        System.out.println("\n--- Scope ---");
        {
            int inside = 10;
            System.out.println("Inne i blocket: " + inside);
        }
        System.out.println("Utanför blocket kan vi inte använda variabeln 'inside'.");
    }

    static void ifExercise() {
        System.out.println("\n--- If (tal > 10) ---");
        System.out.print("Skriv ett tal: ");
        int number = scan.nextInt();

        if (number > 10) {
            System.out.println("Talet är större än 10.");
        } else {
            System.out.println("Talet är 10 eller mindre.");
        }
    }

    static void ifElseExercise() {
        System.out.println("\n--- If/Else (18 år) ---");
        System.out.print("Skriv din ålder: ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig.");
        } else {
            System.out.println("Du är inte myndig.");
        }
    }

    static void elseIfExercise() {
        System.out.println("\n--- Else/If (litet/mellan/stort tal) ---");
        System.out.print("Skriv ett tal: ");
        int number = scan.nextInt();

        if (number < 10) {
            System.out.println("Litet tal.");
        } else if (number <= 20) {
            System.out.println("Mellantal.");
        } else {
            System.out.println("Stort tal.");
        }
    }

    static void switchExercise() {
        System.out.println("\n--- Switch (1–3) ---");
        System.out.print("Skriv ett tal (1–3): ");
        int number = scan.nextInt();

        switch (number) {
            case 1 -> System.out.println("Du valde alternativ 1.");
            case 2 -> System.out.println("Du valde alternativ 2.");
            case 3 -> System.out.println("Du valde alternativ 3.");
            default -> System.out.println("Ogiltigt val.");
        }
    }

    static void whileExercise() {
        System.out.println("\n--- While (1–5) ---");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    static void doWhileExercise() {
        System.out.println("\n--- Do-While ---");
        int i = 1;
        do {
            System.out.println("Detta skrivs minst en gång.");
            i++;
        } while (i < 1);
    }

    static void forLoopExercise() {
        System.out.println("\n--- For-loop (1–10) ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void breakExercise() {
        System.out.println("\n--- Break ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Avbryter loopen vid 5.");
                break;
            }
            System.out.println(i);
        }
    }

    static void continueExercise() {
        System.out.println("\n--- Continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Hoppar över 5.");
                continue;
            }
            System.out.println(i);
        }
    }
}
