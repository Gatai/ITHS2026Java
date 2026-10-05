package Monday20261005;

import java.util.Scanner;

public class ControlFlow {

    static Scanner readLine = new Scanner(System.in); // Statisk variabel som används i klassen.

    static int inputNumber = readLine.nextInt(); // Läser heltalet från användaren. 


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
                // case 4 -> elseIfExercise();
                // case 5 -> switchExercise();
                // case 6 -> whileExercise();
                // case 7 -> doWhileExercise();
                // case 8 -> forLoopExercise();
                // case 9 -> breakExercise();
                // case 10 -> continueExercise();
                case 0 -> {
                    System.out.println("Programmet avslutas.");
                    return;
                }
                default -> System.out.println("Ogiltigt val.");
            }
        }
    }

    private static void scopeExercise(){
        System.out.println("\n--- Scope ---");
        {
            int inside = 10;
            System.err.println("Inne i blocket: " + inside);
        }

        System.out.println("Utanför blocket kan vi inte använda variabeln 'inside'.");
    }

     private static void ifExercise(){
        System.out.println("\n--- If (tal > 10) ---");
        System.out.print("Skriv ett tal: ");

        // int number = readLine.nextInt(); // Läser heltalet från användaren. 
        
        if (inputNumber >= 10) {
            System.out.println("Number " + inputNumber + " is bigger than 10.");
        } else {
            System.out.println("Number is smaller than 10.");
        }
    }

    private static void ifElseExercise(){
        System.out.println("\n--- If/Else (18 år) ---");
        System.out.print("Skriv in ålder:  ");

        int number = readLine.nextInt(); // Läser heltalet från användaren. 
        
        if (number >= 18 ) {
            System.out.print("Du är mydig " + number);
        }else{
            System.out.print("Du är inte mydig " + number);
        }

    }



}




/*
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