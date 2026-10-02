
public class PersonCard {
    public static void main(String[] args){
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true; 

        System.out.println(
            "Firstname: " + firstName + "\n" +
            "LastName: " + lastName + "\n" +
            "Age: " + age + "\n" +
            "Height: " + height + "\n" +
            "Grade: " + grade + "\n" +
            "Likes Java: " + likesJava
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
 */