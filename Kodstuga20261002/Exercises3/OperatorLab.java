package Kodstuga20261002.Exercises3;

public class OperatorLab {
    public static void main (String[] args){
      System.out.println("----------Del 1: Vad skrivs ut? ------------------------------------------------");
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        /*
        Result:
        13
        7
        30
        3
        1
        */

        System.out.println("----------Del 2:  Remainder (%) ------------------------------------------------");

        int number = 17;
        System.out.println(number % 2);

        System.out.println("----------Del 3 – Booleanexperiment ------------------------------------------------");

        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        
        boolean hasTicket = true;
        boolean isAdult = true;
        
        boolean allowed = hasTicket && isAdult;
        System.out.println("You have a ticket: " + allowed);

        System.out.println("----------Operations || ------------------------------------------------");


        boolean hasTicket2 = false;
        boolean isAdult2 = false;
        boolean allowed2 = hasTicket2 || isAdult2;
        System.out.println("You have a ticket: " + allowed2);
        




    }
}

/*
Övning 3 – Operatorlabbet
Skapa filen OperatorLab.java. Döp klassen till OperatorLab och lägg koddelarna nedan inuti main-metoden.
public class OperatorLab {
    public static void main(String[] args) {
        // Lägg övningens kod här.
    }
}
Del 1 – Vad skrivs ut?
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);

Del 2 – Remainder (%)
int number = 17;

System.out.println(number % 2);

Frågor:
Vad blir resultatet?
Vad händer om number ändras till 18?
Vad kan % 2 användas till?

 Del 3 – Booleanexperiment
int age = 20;

boolean test1 = age > 18;
boolean test2 = age < 18;
boolean test3 = age == 20;
boolean test4 = age != 20;

System.out.println(test1);
System.out.println(test2);
System.out.println(test3);
System.out.println(test4);
Testa sedan logiska operatorer:
boolean hasTicket = true;
boolean isAdult = true;

boolean allowed = hasTicket && isAdult;
System.out.println(allowed);
Ändra värdena och prova även ||.

*/
