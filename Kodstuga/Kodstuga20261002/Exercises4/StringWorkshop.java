package Kodstuga.Kodstuga20261002.Exercises4;

public class StringWorkshop {
    public static void main(String[] args) {
        System.out.println("----------Övning 4 - Stringverkstaden------------------------------------------------");

        String firstName = "Anna";
        String lastName = "Andersson";
        String fullName = firstName + " " + lastName;
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println("FullName: " + fullName);
        System.out.println("FullName with length: " + fullName.length());

        System.out.println("Hej! Jag heter " + fullName);
        System.out.println("Mitt namn innehåller " + fullName.length() + "tecken.");

        System.out.println(
                "Jag bor i " + city + "\n" +
                        "Jag har jobbat som: " + profession + "sedan många år tillbaka" + "\n");

    }
}

/*
 * Övning 4 – Stringverkstaden
 * Syfte: Kombinera String, variabler, konkatenering och length().
 * Skapa filen StringWorkshop.java. Döp klassen till StringWorkshop och lägg
 * koden nedan inuti main-metoden.
 * public class StringWorkshop {
 * public static void main(String[] args) {
 * // Lägg övningens kod här.
 * }
 * }
 * String firstName = "Anna";
 * String lastName = "Andersson";
 * 
 * String fullName = firstName + " " + lastName;
 * 
 * System.out.println(fullName);
 * System.out.println(fullName.length());
 * 
 * Bygg sedan utskrift som ser ut ungefär så här:
 * Hej! Jag heter Anna Andersson.
 * Mitt namn innehåller 14 tecken.
 * 
 * Bonus
 * String city = "Göteborg";
 * String profession = "Mjukvarutestare";
 * 
 * Använd variablerna för att skapa meningen:
 * Anna Andersson bor i Göteborg och utbildar sig till Mjukvarutestare.
 * 
 * 
 */