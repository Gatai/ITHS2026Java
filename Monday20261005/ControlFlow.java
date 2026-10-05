package Monday20261005;

import java.util.Scanner;

public class ControlFlow {

    static Scanner readLine = new Scanner(System.in); // Statisk variabel som används i klassen.

    static int inputNumber;  

    public static void main (String [] args){
        
        //Gör menyn för användaren.
        while (true) {
            System.out.println("\nVälj en övning");
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
            int choice = readLine.nextInt(); // användarens input från console.
            
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

    private static void printSelectionTitle(String title){
        System.out.println("\\n--- "+ title + " ---");
    }


    private static void scopeExercise(){
        printSelectionTitle("Scope");
        {
            int inside = 10;
            System.err.println("Inne i blocket: " + inside);
        }

        System.out.println("Utanför blocket kan vi inte använda variabeln 'inside'.");
    }

     private static void ifExercise(){
        printSelectionTitle("If (tal > 10)");
        System.out.print("Skriv ett tal: ");

        inputNumber = readLine.nextInt(); // Läser heltalet från användaren. 
        
        if (inputNumber >= 10) {
            System.out.println("Number " + inputNumber + " is bigger than 10.");
        } else {
            System.out.println("Number is smaller than 10.");
        }
    }

    private static void ifElseExercise(){
        printSelectionTitle( "If/Else (18 år");
        System.out.print("Skriv in ålder:  ");

        inputNumber = readLine.nextInt(); // Läser heltalet från användaren. 
        
        if (inputNumber >= 18 ) {
            System.out.println("Du är mydig " + inputNumber);
        }else{
            System.out.println("Du är inte mydig " + inputNumber);
        }
    }

     private static void elseIfExercise(){
        printSelectionTitle("elseIf (litet, mellan eller stort tal.");
        System.out.println("Skrivin ett tal:  ");

        inputNumber = readLine.nextInt(); // Läser heltalet från användaren.
        
        if (inputNumber < 10) {
            System.out.println("Litet tal");
        }else if (inputNumber <= 20) {
            System.out.println("Mellantal");
        }
            System.out.print("Stort tal!"); // Short else utan {}.
    }

    private static void switchExercise(){
        printSelectionTitle("Switch (1-3)");
        System.out.print("Skriv in ett tal mellan 1-3: ");

        inputNumber = readLine.nextInt();

        switch (inputNumber) {
            case 1 -> System.out.println("Du valde alternativ 1.");
            case 2 -> System.out.println("Du valde alternativ 2.");
            case 3 -> System.out.println("Du valde alternativ 3.");
            default -> System.out.println("Ogiltigt val.");
        }
    }

    private  static void whileExercise(){
        printSelectionTitle("While (1-x )");
        System.out.println("Skriv in ett tal för att siffrorna skall skrivas ut antal. ");
        
        inputNumber = readLine.nextInt();
        int i = 1;
        while (i <= inputNumber) {
            System.out.println("Nummer " + i);
            i++;
        }
    }

    private static void doWhileExercise(){
        printSelectionTitle("Do-While");
        int i = 1;

        do {
            System.out.println("Detta kör minst en gång!");
            i++;
        }while(i < 1);
    }

    private static void forLoopExercise() {
        printSelectionTitle("For-loop (Du matar in hur många loopar for skall göra.)");

        for (int i = 1; i <= inputNumber; i++) {
            System.out.println(i);
        }
    }

    private static void breakExercise() {
        printSelectionTitle("Break");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Avbryter loopen vid 5.");
                break;
            }
            System.out.println(i);
        }
    }

   private static void continueExercise() {
        printSelectionTitle("Continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Hoppar över 5.");
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
Uppgifterna nedan:


Scope
Skapa en variabel inne i ett kodblock och testa vad som händer om du försöker använda den utanför blocket.

If
Gör ett program som skriver ut ett meddelande om ett tal är större än 10.

If/else
Gör ett program som kontrollerar om en person är 18 år eller äldre.

Else/if
Gör ett program som skriver ut olika meddelanden beroende på om ett tal är litet, mellan eller stort.

Switch
Låt ett tal mellan 1 och 3 motsvara tre olika alternativ och skriv ut rätt alternativ.

While
Skriv ut talen 1 till 5 med en while-loop.

Do-While
Skriv ut ett meddelande minst en gång med en do-while-loop.

For-loop
Skriv ut talen 1 till 10 med en for-loop.

Break
Gör en loop som avbryts när räknaren når ett visst tal.

Continue
Gör en loop som hoppar över ett visst tal.



*/