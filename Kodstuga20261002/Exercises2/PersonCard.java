
package Kodstuga20261002.Exercises2;

public class PersonCard {
    public static void main(String[] args){

        System.out.println("----------Del 1 - Skapa variabler som beskriver en påhittad person: och Del 2 – Beräkna nästa års ålder------------------------------------------------");

        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        int ageNextYear = age + 1;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true; 

        System.out.println(
            "Firstname: " + firstName + "\n" +
            "LastName: " + lastName + "\n" +
            "Age: " + age + "\n" +
            "ageNextYear: " + ageNextYear + "\n" +
            "Height: " + height + "\n" +
            "Grade: " + grade + "\n" +
            "Likes Java: " + likesJava
         );

         System.out.println("Nästa år är Lisa " + ageNextYear + ".");

         System.out.println("----------------------------------------------------------");

         System.out.println("-------------------------Del 3 – Förbättra variabelnamnen---------------------------------");

        String car = "Volvo";
        int year = 2022;
        double mile = 185000;
        boolean sold = true;
    
     System.out.println(
            "Car Name: " + car + "\n" +
            "Year: " + year + "\n" +
            "Mile: " + mile + "\n" +
            "Is the car sold: " + sold
         );
    
    
    }
}

/*Del 1 - Skapa variabler som beskriver en påhittad person:
String firstName = "Lisa";
String lastName = "Andersson";
int age = 28;
double height = 1.72;
char grade = 'B';
boolean likesJava = true;

Skriv ut värdena så att programmet exempelvis ger:
Namn: Lisa Andersson
Ålder: 28
Längd: 1.72
Betyg: B
Gillar Java: true

Del 2 – Beräkna nästa års ålder
int ageNextYear = age + 1;
Skriv sedan ut:
Nästa år är Lisa 29 år.

Del 3 – Förbättra variabelnamnen
Utgå från koden:
String n = "Volvo";
int x = 2022;
double y = 185000;
boolean b = true;

Byt namn på variablerna så att någon annan programmerare förstår dem utan förklaring. Ett möjligt resultat:
String carBrand = "Volvo";
int modelYear = 2022;
double price = 185000;
boolean isElectric = true;

*/