package Monday20261005;

import java.util.Scanner;

public class ControlFlow {
    public static void main (String [] args){
    /*
        If
        Gör ett program som skriver ut ett meddelande om ett tal är större än 10.
    
        Min egna extra: låt användaren bestämma inmatningen på nr.
        */

        Scanner readInput = new Scanner(System.in); // Skapar ett objekt som kan läsa från tangentbordet.

        System.out.print("Wrtite a number: ");
        int userInput = readInput.nextInt(); // Läser heltalet från användaren. 
        
        if (userInput >= 10) {
            System.out.println("Number is bigger than 10.");
        } else {
            System.out.println("Number is smaller than 10.");
        }

        readInput.close();

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