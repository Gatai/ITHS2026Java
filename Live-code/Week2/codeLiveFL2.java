public class codeLiveFL2 {
    public static void main(String[] args) {

        // 1. CODE BLOCKS OCH SCOPE
        // Ett kodblock omges av { }.
        // Variabler som skapas inne i ett block finns bara i det blockets scope.

        {
            int maxCount = 10;
            System.out.println("maxCount inne i blocket = " + maxCount);
        }

        // 2. IF
        // Ett if-block körs bara om villkoret är true.

        int age = 20;

        if (age >= 18) {
            System.out.println("Du är myndig.");
        }

        // 3. IF / ELSE
        // if körs om villkoret är true.
        // else körs om villkoret är false.

        int temperature = 8;


        if (temperature >= 15) {
            System.out.println("Det är ganska varmt ute.");
        } else {
            System.out.println("Det är ganska kallt ute.");
        }

        // 4. IF / ELSE IF / ELSE
        // Java testar villkoren uppifrån och ner.
        // När ett villkor blir true körs det blocket och resten hoppas över.

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Poäng: " + testScore);
        System.out.println("Betyg: " + grade);

        // 5. SWITCH
        // switch passar bra när ett värde ska jämföras med flera bestämda fall.
        // break avslutar det aktuella case-blocket.

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Ogiltig dag.");
        }

        // 6. WHILE
        // En while-loop fortsätter så länge villkoret är true.
        // Villkoret kontrolleras INNAN varje varv.

        int i = 1;

        while (i < 5) {
            System.out.println("i = " + i);
            i++; // Viktigt: värdet måste förändras så att loopen kan avslutas.
        }

        // 7. WHILE + BREAK
        // while (true) är en loop vars villkor alltid är true.
        // break kan användas för att avsluta loopen.

        int counter = 1;
        while (true) {
            System.out.println("counter = " + counter);

            if (counter == 3) {
                break;
            }

            counter++;
        }

        // 8. DO-WHILE
        // En do-while-loop kör kodblocket först och testar villkoret efteråt.
        // Därför körs blocket alltid minst en gång.


        int number = 10;
        do {
            System.out.println("number = " + number);
            number++;
        } while (number < 5);

        // Trots att 10 < 5 är false skrivs number ut en gång,
        // eftersom villkoret kontrolleras först efter att blocket har körts.

        // 9. FOR
        // En for-loop består av tre delar:
        // 1. initialization  -> int j = 1
        // 2. condition       -> j < 5
        // 3. incrementor     -> j++

        for (int j = 1; j < 5; j++) {
            System.out.println("j = " + j);
        }

        // Variabeln j finns bara inne i for-loopens scope.
        // Detta hade därför gett kompileringsfel eftersom den ligger utanför scopet:
        // System.out.println(j);

        // 10. CONTINUE
        // continue avbryter den AKTUELLA iterationen
        // och går direkt vidare till nästa iteration.

        for (int k = 1; k < 20; k++) {

            // Om k INTE är jämnt delbart med 3 hoppar vi vidare.
            if (k % 3 != 0) {
                continue;
            }

            System.out.println(k + " är jämnt delbart med 3.");
        }

        // 11. BREAK OCH CONTINUE TILLSAMMANS
        // break    = avsluta hela loopen.
        // continue = hoppa över resten av det aktuella varvet.

        for (int value = 1; value <= 10; value++) {

            if (value == 5) {
                System.out.println("Hoppar över 5.");
                continue;
            }

            if (value == 9) {
                System.out.println("Avslutar loopen vid 9.");
                break;
            }

            if (value % 2 == 0) {
                System.out.println(value + " är jämnt.");
            } else {
                System.out.println(value + " är udda.");
            }
        }
    }
}
