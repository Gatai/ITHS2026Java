package Classes20261007.Exercises3Robot;
/*
Övning 3 – Robot
•	Skapa en klass Robot med ett public field namn och ett private field batteri.
•	Sätt värdena med en konstruktor och använd this.
•	Skapa en metod visaStatus() som skriver ut namn och batteri.
•	Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main.
*/

public class Robot {
    private int battery;
    public String name;
    public int year;
    
   public Robot(String name, int battery){ // konstruktor
        this.name = name;
        this.battery = 100; // Man kommer inte kunna nå denna då det är privat.
    }


/*
Extra – om du blir klar snabbt
Lägg till en extra konstruktor i någon av klasserna så att objekt kan skapas med färre argument.

*/
      // Överlagrade konstruktorers
     public Robot(int year){ // konstruktor
        this.year = year;
    }

    public void displayStatus(){
        System.out.println("This is " + name + " and is a robot and has " + battery + " % battery left.");
        System.out.println("This is year " + year );
    
    }
}
